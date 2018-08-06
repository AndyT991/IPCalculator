package subnetting;

public class Menu {
	String address;
	String subnet;
	
	public void getInfo() {

		System.out.println("Welcome to IP calculator");

		System.out.println("Enter address");
		address = Driver.input.next();

		System.out.println("Enter subnet");
		subnet = Driver.input.next();
		System.out.println();
		
		calculations();
	}

	public void display() {

		System.out.println("Press enter to continue");
		System.out.println("Enter q to quit");
		String option = Driver.input.nextLine();

		if (option.equalsIgnoreCase("q")) {
			return;
		} else if (option.isEmpty()) {
			getInfo();
		}

	}

	public void calculations() {
		Subnet mask = new Subnet();
		Address host = new Address();
		// prints conversion
		mask.verify(subnet);
		host.verify(address);

		host.classCheck();
		
		//prints id 
		System.out.println(host.findNetworkID(mask.getBits()));
		System.out.println("Network ID: " + host.convertToDecimal(host.id));
		System.out.println();
		// prints broadcast
		System.out.println(host.findNetworkBroadcast(mask.getBits()));
		System.out.println("Broadcast ID: " + host.convertToDecimal(host.broadcast));
		System.out.println();
		//prints first and last addresses 
		System.out.println(host.findMinHost(mask.getBits()));
		System.out.println("First host address: "+host.convertToDecimal(host.firstAddress));
		System.out.println(host.findMaxHost(mask.getBits()));
		System.out.println("Last host address: "+host.convertToDecimal(host.lastAddress));
		System.out.println();
		System.out.println("Total subnets: ");
		System.out.println("Total hosts: ");
		

	}

}

package subnetting;

public class Menu {

	public void getInfo() {
		// Creating instances
		Subnet mask = new Subnet();
		//Address host = new Address();
		
		System.out.println("Welcome to IP calculator");

		//System.out.println("Enter address");
		//String address = Driver.input.nextLine();

		System.out.println("Enter subnet");
		String subnet = Driver.input.next();
		
		mask.verify(subnet);
		//host.convert(address);
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

}
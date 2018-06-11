package subnetting;

public class Subnet extends Network {
	int bits;

	public void verify(String x) {
		if (x.length() <= 2) {
			System.out.println("You have entered the number of bits");
			bits = Integer.parseInt(x);

		} else if (x.length() > 2 && x.contains(".")) {
			System.out.println("You have entered the subnet mask");
			convertToBits(x);
			
		} else if (x.length() > 3) {
			System.out.println("Error invalid input");
			Menu menu = new Menu();
			menu.display();
		}

	}

	@Override
	public void convertToBits(String net) {

		// System.out.println(net);

		// split = net.split(Pattern.quote("."));

		if (length > 4) {
			System.out.println("This subnet address is invalid");
			Menu menu = new Menu();
			menu.display();
		}

		super.convertToBits(net);

	}

}

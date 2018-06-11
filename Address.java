package subnetting;

public class Address extends Network {
	int bits;
	String [] split;
	
	public void verify(String address) {
		if(!address.contains(".")) {
			System.out.println("The address you have entered is invalid");
			Menu menu = new Menu();
			menu.display();
		}
		else {
			convertToBits(address);
		}
		
	}
	@Override
	public void convertToBits(String address) {
		super.convertToBits(address);
		
		
	}
	

}

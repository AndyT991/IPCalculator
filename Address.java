package subnetting;

import java.util.ArrayList;

public class Address extends Network {
	
	String [] split;
	private int defaultSubnetMask;
	private ArrayList <Integer> id;
	String[] idInOctet;
	
	public void classCheck() {
		
		System.out.println(IPClass);
		
		if(IPClass<126) {
			System.out.println("Class A");
			defaultSubnetMask = 8;
		}
		else if(IPClass>128 && IPClass<191) {
			System.out.println("Address is Class B");
			defaultSubnetMask = 16;
		}
		else if(IPClass>192 && IPClass<223) {
			System.out.println("Address is Class C");
			defaultSubnetMask = 24;
		}
		else if(IPClass>=224 && IPClass<=239) {
			System.out.println("Address is Class D, Reserved for multicasting");
		}
		
		
	}
	
	public void verify(String address) {
		if(!address.contains(".")) {
			System.out.println("The address you have entered is invalid");
			Menu menu = new Menu();
			menu.display();
		}
		else {
			System.out.println("Address in binary");
			convertToBits(address);
		
		}

	}
	@Override
	public void convertToBits(String address) {
		super.convertToBits(address);
		
	}
	
	public void findNetworkID(int bits) {
		id = new ArrayList<Integer>(conversion);
		
		//System.out.println(bits);
		
		for(int i=0; i < 32-bits; bits++) {
			id.set(bits, 0);
		}
		
		System.out.println(id);
	}
	
	public int getDefaultSubnetMask() {
		return defaultSubnetMask;
	}
	
	public ArrayList<Integer> getId(){
		return id;
	}
	

}


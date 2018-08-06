package subnetting;

import java.util.ArrayList;

public class Address extends Network {
	
	String [] split;
	private int defaultSubnetMask;
	ArrayList <Integer> id;
	ArrayList <Integer> broadcast;
	ArrayList <Integer> lastAddress;
	ArrayList <Integer> firstAddress;
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
		System.out.println();
		
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
	
	public ArrayList<Integer> findNetworkID (int bits) {
		id = new ArrayList<Integer>(conversion);
		
		//System.out.println(bits);
		
		for(int i=0; i < 32-bits; bits++) {
			id.set(bits, 0);
		}
		
		//System.out.println(id);
		return id;
	}
	
	public ArrayList<Integer> findNetworkBroadcast(int bits) {
		broadcast = new ArrayList<Integer>(conversion);
		
		for(int i=0; i<32-bits; bits++) {
			broadcast.set(bits, 1);
		}
		
		//System.out.println(broadcast);
		return broadcast;
	}
	
	public ArrayList<Integer> findMaxHost(int bits) {
		lastAddress = new ArrayList<Integer>(findNetworkBroadcast(bits));
		lastAddress.set(31,0);
		return lastAddress;
	}
	
	public ArrayList<Integer> findMinHost(int bits) {
		firstAddress = new ArrayList<Integer>(findNetworkID(bits));
		firstAddress.set(31, 1);
		return firstAddress;
	}
	
	public int getDefaultSubnetMask() {
		return defaultSubnetMask;
	}
	
	public ArrayList<Integer> getId(){
		return id;
	}
	

}

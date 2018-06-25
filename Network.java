package subnetting;

import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class Network {
	
	protected String[] split;
	//Main array that holds converted addresses 
	protected ArrayList <Integer> conversion;
	protected int bits;
	protected int length;
	protected int IPClass;
	
	public abstract void verify(String x);
		
	//This method uses multiple arrays to 
	//1st: Convert a string into individual elements
	//2nd Parse those individual string elements into ints 
	//3rd 
	public void convertToBits(String x) {
		ArrayList<Integer> binary = new ArrayList<Integer>();
		conversion = new ArrayList<Integer>();
		
		
		split = x.split(Pattern.quote("."));
		
		length = split.length;
		
		//for loop used to add individual numbers into binary array 
		for( int i=0; i<split.length;i++ ) {
			binary.add( Integer.parseInt(split[i]) );
		}
		//Assigns first octet to variable IPClass
		IPClass = binary.get(0);
		
		for(int i=0; i < binary.size();i++) {
			//array used to temporailly hold values
			int [] holder = new int[8];
			int counter = 7;
			
			while(binary.get(i)>0) {
				
				int num = binary.get(i);
				int quotient = binary.get(i)/2;
				num = num % 2;
				
				binary.set(i,quotient);
				holder[counter] = num;
				counter = counter -1;
			}
			for(int j=0;j<holder.length;j++) {
				conversion.add(holder[j]);
			}
		}
		
		System.out.println(conversion);
		System.out.println(conversion.size());
		
	}
	
	
	public void getBits() {
		int counter = 0;
		for(int i=0;i<conversion.size();i++) {
			if(conversion.get(i)==1) {
				counter++;
			}
		}
		
		System.out.println("Subnet bits "+counter);
		counter = bits;
	}
	
}

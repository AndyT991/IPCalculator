package subnetting;

import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class Network {
	
	protected String[] split;
	protected ArrayList <Integer> conversion;

	
	//protected ArrayList <Integer> binary;
	
	protected int bits;
	protected int length;
	
	public abstract void verify(String x);
		
	
	public void convertToBits(String x) {
		ArrayList<Integer> binary = new ArrayList<Integer>();
		conversion = new ArrayList<Integer>();
		
		split = x.split(Pattern.quote("."));
		
		length = split.length;
		
		for( int i=0; i<split.length;i++ ) {
			binary.add( Integer.parseInt(split[i]));
		}
		
		//find a way to accept zeros 
		for(int i=0; i < binary.size();i++) {
			
			if(binary.get(i)==0) {
				for(int j=0;j<8;j++) {
					conversion.add(0);
					continue;
				}
			}
			
			while(binary.get(i)>0) {
				/*
				if(binary.get(i)==0) {
					for(int j=0;j<8;j++) {
						conversion.add(0);
						continue;
					}
				}
				*/
				int num = binary.get(i);
				int quotient = binary.get(i)/2;
				num = num % 2;
				
				conversion.add(num);
				binary.set(i,quotient);
			}
			
			
		}
		
		System.out.println(conversion);
		
		
	}
	

}

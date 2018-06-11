package subnetting;

import java.util.Scanner;

public class Driver {
	static Scanner input;
	

	public static void main(String[]args) {
		input = new Scanner(System.in);
		System.out.println("IP calculator");
		Menu menu = new Menu();
		menu.display();
	}

}

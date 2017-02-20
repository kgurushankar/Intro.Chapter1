package userInput;

import java.util.Scanner;

public class HelloName {
	

	public static void main(String[] args){

		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your name:");
		String a = console.nextLine();
		System.out.println("\nHello " + a);
		
		//closes console to prevent memory overuse
		console.close();
	}
		
}
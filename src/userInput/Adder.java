package userInput;
import java.util.Scanner;
public class Adder {
	
	public static void main(String[] args){
		//System.out.print("Enter an Integer: ");
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = console.nextInt();
		System.out.println("\nEnter another number:");
		int b = console.nextInt();
		int sum = a + b;

		System.out.println("\nThe sum of " + a + " and " + b + " is: " + sum);
		
		//closes console to prevent memory overuse
		console.close();
	}
}

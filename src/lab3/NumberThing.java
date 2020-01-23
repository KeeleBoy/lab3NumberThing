package lab3;

/*
@ Author Kyle Warchuck
*/
import java.util.Scanner;

public class NumberThing {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scnr.nextLine();
		
		System.out.println("Hello " + name + " Please enter an intiger between 1 and 100: ");
		int input1 = scnr.nextInt();
		int eo = input1 % 2; 
		scnr.close();
		
		if (input1 > 100 || input1 < 0) {
			System.out.println("Number is not between 1 and 100");
		}
		
		else {
			if(eo == 0) {
			
				if (input1 > 2 && input1 < 25) {
					System.out.println("Even and less than 25");
				} 
				
				else if (input1 > 25 && input1 < 61) {
					System.out.println("Even");
				}
				else if (input1 > 59) {
					System.out.println(input1 + " Even");
				}
			}
				
			else {
				if (input1 < 60) {
					System.out.println(input1 + " odd");
				} 
				
				else if (input1 > 60) {
					System.out.println("Odd and over 60");
				}

				}
			System.out.println("Goodbye!");
			}
		}
	}


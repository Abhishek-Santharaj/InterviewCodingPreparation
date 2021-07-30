/*
A narcissistic number, also known as an Armstrong number or a plus perfect number, is an n-digit number equal to the sum of its digits raised to the nth power. For instance, 371 is narcissistic because 33 + 73 + 13 = 371, and 9474 is narcissistic because 94 + 44 + 74 + 44 = 9474. The smallest narcissistic number of more than one digit is 153 = 13 + 53 + 33. The largest narcissistic number (in base 10) is 115132219018763992565095597973971522401, which is the sum of the 39th powers of its digits.
*/

import java.util.Scanner;

public class Armstrongnumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int input=sc.nextInt();
		
		sc.nextLine();
		
		int total=0;
		int testinput=input;
		
		while(testinput>0) {
			
			int digit=testinput%10;
			total+=(digit*digit*digit);
			testinput=testinput/10;
			
		}
		
		if (total==input) {
			
			System.out.println("This is an Armstrong Number");
		
		}else {
			System.out.println("This is not an Armstrong Number");
		}
		
		sc.close();
		
	}

}
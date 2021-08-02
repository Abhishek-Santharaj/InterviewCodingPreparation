// Sum of digits till it results in single digit.

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int input = sc.nextInt();
		int result = additionOfDigits(input);
		if(result>9)
			result = additionOfDigits(result);
		System.out.println(result);

		
	}
	private static int additionOfDigits(int input)
	{
	int total=0;
  
		while(input>0) {

			total = total + input%10;
			input/=10;

		}

		return total;
	}

}
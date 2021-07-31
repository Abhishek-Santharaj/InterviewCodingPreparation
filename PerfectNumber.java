/*A perfect number is a whole number that is equal to the sum of all its factors except itself. For example, 6 is a perfect number because its factors, 1, 2, and 3 add to give 6. The next smallest is 28 (the sum of 1 + 2 + 4 + 7 + 14).*/
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int input=sc.nextInt();
		int Perfect=0;
		int div =1;
		int PerfectNumber =0;
		int PN=0;
		
		int total=0;
		while(div<=(input/2))
		{
			if(input%div==0)
			{
		    PN = div;
		    Perfect = Perfect+ PN;
			}
			div++;
			
		}
		if(input==Perfect)
			System.out.println("It is a Perfect Number");
		else
			System.out.println("Not a Perfect Number");

	}


}

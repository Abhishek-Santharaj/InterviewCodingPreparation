import java.util.Scanner;

public class commonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number 1:");
		
		int no1=sc.nextInt();	
		System.out.println("Enter a number 2:");

		int no2=sc.nextInt();		

		int small = no1<no2 ? no1 : no2;
		int div =2;
		int gcd =-1;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd=div;
			}
			div++;
		}
		if(gcd>0)
			System.out.println("GCD is "+ gcd);
		else
			System.out.println("No GCD is found");
	}

}

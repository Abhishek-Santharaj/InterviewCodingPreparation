import java.util.Scanner;

public class BinaryToNumber {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		int total=0;
		int i = 0;
		while(no>0)
		{
			int rem = no%10;
			total = total + (rem * (int)Power(2,i));
			no=no/10;
			i++;
		}
		System.out.println(total);
	}

	private static int Power(int i, int j) {
		int result=1;
		if(j==0)
			return 1;
		else if(j==1)
			return i;
		else
		{	
			while(j>0)
			{
			 result = result * i;	
			 j--;
			}
			return result;
		}
		
	}

}

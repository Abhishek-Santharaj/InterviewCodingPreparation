import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int no2 = sc.nextInt();
		
		int big = no1>no2?no1:no2;
		
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println(big);
				break;
			}
			big++;
		}
	}

}

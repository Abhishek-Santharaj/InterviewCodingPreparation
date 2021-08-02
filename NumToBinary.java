import java.util.Scanner;

public class NumToBinary {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		String bin="";
		do
		{
			int rem=no%2;
			bin=rem+bin;   // String concatenation (0+"" , 0+"0", 1+"00" ) = "100"
			no=no/2;
			
		}while(no>0);
		System.out.print(bin);

	}

}

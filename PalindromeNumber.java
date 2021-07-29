import java.util.*;
public class PalindromeNumber
{
public static void main(String[] args)
{
	int num,reverseNum = 0,remainder,copyN;
	
    System.out.println("Enter a number: ");

	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
  
    copyN = num;

    while(num!=0)
    {
        remainder=num%10;
        reverseNum=reverseNum*10 + remainder;
        num=num/10;
    }
    if(reverseNum == copyN)
        System.out.println("Palindrome");
    else
        System.out.println("Not a Palindrome");
    
    

}
}
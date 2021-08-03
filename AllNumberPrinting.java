
import java.util.Scanner;

public class AllNumberPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		String Alphanumber=getHundredWords(num);
		System.out.println(Alphanumber);
	}
	private static String[] DIGIT_WORDS = {
		    "zero", "one", "two", "three", "four",
		    "five", "six", "seven", "eight", "nine" };
	
			private static String[] TENS_WORDS = {
			    "ten", "twenty", "thirty", "forty", "fifty",
			    "sixty", "seventy", "eighty", "ninety" };
			
			private static String[] TEENS_WORDS = {
			    "ten", "eleven", "twelve", "thirteen", "fourteen",
			    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
			

			private static String getHundredWords(int num) {
			    if (num > 999 || num < 0)
			        throw new IllegalArgumentException(
			            "Cannot get hundred word of a number not in the range 0-999");
			    if (num == 0) return "zero";        
			    String ret = "";
			    if (num > 99) {
			        ret += DIGIT_WORDS[num / 100] + " hundred ";
			        num %= 100;
			    }
			    if (num < 20 && num > 9) {
			        ret += TEENS_WORDS[num % 10];
			    } else if (num < 10 && num > 0) {
			        ret += DIGIT_WORDS[num];
			    } else if (num != 0) {
			        ret += TENS_WORDS[num / 10 - 1];
			        if (num % 10 != 0) {
			        ret += " " + DIGIT_WORDS[num % 10];
			    }}

			    return ret;
			}

	

}

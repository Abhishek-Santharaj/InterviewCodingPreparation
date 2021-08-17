
import java.util.Scanner;

public class AddNumbersInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");

		String country = sc.nextLine();

		String additionOfDigits = "";

		for (int i = 0; i < country.length(); i++) {

			char ch = country.charAt(i);
			if (ch >= '0' && ch <= '9')
				additionOfDigits = additionOfDigits + ch;

		}
		int no = Integer.parseInt(additionOfDigits);

		int result = additionOfDigits(no);

		System.out.println(result);
	}

	private static int additionOfDigits(int input) {
		int total = 0;
		while (input > 0) {
			total = total + (input % 10);
			input = input / 10;
		}
		return total;
	}

}

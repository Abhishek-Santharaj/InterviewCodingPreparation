
public class CaseChanging {

	public static void main(String[] args) {

		String firstName = "ABHISHEK";
		String lastName = "SANTHARAJ";

		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (i % 2 != 0) {
				int n = ch + 32;
				ch = (char) n;

			}
			System.out.print(ch);
		}

		System.out.println();

		for (int i = 0; i < lastName.length(); i++) {
			char ch = lastName.charAt(i);
			if (i % 2 == 0) {
				int n = ch + 32;
				ch = (char) n;

			}
			System.out.print(ch);
		}
	}

}

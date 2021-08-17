
import java.util.Scanner;

public class SEOStopWords {

	public static void main(String[] args) {
		
		String search = "the best hotel in or nearby Madurai";

		String[] stopwords = { "in", "IN", "or", "OR", "nearby", "NEARBY", "AT", "at", "a", "A", "an", "AN", "the",
				"THE", "around", "AROUND" };
		String s;
		String newString = "";

		String[] words = search.split(" ", 15);
		for (int j = 0; j < stopwords.length; j++) {
			s = stopwords[j];

			for (int i = 0; i < words.length; i++) {
				if (s.equals(words[i])) {
					words[i] = words[i].replace(s, "");

				}
				newString = String.join(" ", words);

			}

		}
		newString = newString.trim().replaceAll(" +", " ");
		System.out.println(newString);

	}

}

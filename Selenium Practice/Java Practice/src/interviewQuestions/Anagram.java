package interviewQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s = "Dusty";
		String s1 = "Study";
		String SLower = s.toLowerCase();
		String s1Lower = s1.toLowerCase();
		char[] c = SLower.toCharArray();

		char[] c1 = s1Lower.toCharArray();

		Arrays.sort(c);
		Arrays.sort(c1);

		if (Arrays.equals(c, c1)) {
			System.out.println(s + " and " + s1 + " are anagram");
		} else {
			System.out.println(s + "  and " + s1 + " are not anagram");
		}

	}

}

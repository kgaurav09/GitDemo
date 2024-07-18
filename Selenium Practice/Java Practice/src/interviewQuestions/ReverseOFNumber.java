package interviewQuestions;

public class ReverseOFNumber {

	public static void main(String[] args) {

		int number = 2345, rev = 0;

		while (number != 0) {
			int reminer = number % 10;
			rev = rev * 10 + reminer;
			number = number / 10;
		}
		System.out.println("reverse number is  " + rev);
	}

}

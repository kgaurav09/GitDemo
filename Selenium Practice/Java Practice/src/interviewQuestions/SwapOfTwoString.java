package interviewQuestions;

public class SwapOfTwoString {

	public static void main(String[] args) {
		
		String s1="good";
		String s2="morning";
		s1=s1+s2;
		
		
		s2=s1.substring(0, (s1.length()-s2.length()));
		
		s1=s1.substring(s2.length());
		
		System.out.println("after swapping s1 is "+s1+ " and s2 is "+s2);

	}

}

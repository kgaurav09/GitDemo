package interviewQuestions;

public class StringContainsOnlyDigit {

	public static void main(String[] args) {
		
		String s="abc1234rgjt";
		
		if(s.matches("[0-9]+")&& s.length()>2)
		{
			System.out.println("String contains only digit");
		}
		else
		{
			System.out.println("String contains digit as well as other charcter");
		}
		
		

	}

}

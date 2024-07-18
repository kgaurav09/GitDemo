package interviewQuestions;

public class RemoveGivenCharFromString {
	
	public static void removeChar(char ch, String str)
	{
		String newstr=str.replace(ch, ' ');
		System.out.println("new replaced string is  "+newstr);
		
		
	}

	public static void main(String[] args) {
		
		removeChar('e',"myname");

	}

}

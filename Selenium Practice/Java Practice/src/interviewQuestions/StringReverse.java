package interviewQuestions;

public class StringReverse {

	public static void main(String[] args) {
		String s="Ram and sita";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
System.out.println(rev);
if(!s.equals(rev))
{
	System.out.println("string is palindrome");
	}
	}

}

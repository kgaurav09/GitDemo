package interviewQuestions;

import java.util.HashSet;

public class FirstRepeatingCharInString {
	
	public static char RepeatingChar(char[] charArray)
	
	{
		HashSet<Character> hs= new HashSet<Character>();
		
		for(char c:charArray)
		{
			if(hs.contains(c))
			{
				return c;
			}
				else
				{
					hs.add(c);
				}
			}
		return ' ';
		}
		
	

	public static void main(String[] args) {
		
		String s="abcdefa";
		System.out.println("repeating first charcter is "+ RepeatingChar(s.toCharArray()) );
		

	}

}

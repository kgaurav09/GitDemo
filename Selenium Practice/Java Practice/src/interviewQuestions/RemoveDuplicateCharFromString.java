package interviewQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
	
		
		String str="absscccddeff";
		
		Set<Character> charset= new LinkedHashSet<Character>();
		
		for(char c:str.toCharArray())
		{
			charset.add(c);
		}
		
StringBuilder sb= new StringBuilder();

for(Character ch:charset)
{
	sb.append(ch);
	}
		
		
		System.out.println(sb.toString());
		
		
				}

}

package interviewQuestions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatedCharcter {
	
	 public static Character FirstNonRepeatedChar(char[] str)
	 {
		 Set<Character> repeating = new HashSet<Character>();
		 List<Character> nonRepeating= new ArrayList<Character>();
		 
		 for(Character ch:str)
		 {
			 if (repeating.contains(ch)) {
				 continue;
				}
			 if (nonRepeating.contains(ch)) {
				 nonRepeating.remove((Character)ch);
				 repeating.add(ch);			
			}
			 else {
				nonRepeating.add(ch);
			}
		 }
		 return nonRepeating.get(0);
	 }


	public static void main(String[] args) {
		
		String s="abcabcded";
		
		System.out.println("first non repeating charcter is :"+FirstNonRepeatedChar(s.toCharArray()));
		
	}

}

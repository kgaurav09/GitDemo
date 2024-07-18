import java.util.Arrays;

public class AnaramCheck {

	public static void main(String[] args) {
		String s1="Race";
		String s2="care";
		
		char[] arrays1=s1.toLowerCase().toCharArray();
		char[] arrays2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(arrays2);
		Arrays.sort(arrays1);
		
		if(Arrays.equals(arrays1, arrays2))
		{
			System.out.println(s1 + "and" + s2 + "are anagram");
		}
		else
		{
			System.out.println(s1+"and"+s2+ "are not anagram");
			
		}

	}

}

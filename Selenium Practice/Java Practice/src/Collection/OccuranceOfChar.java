package Collection;

import java.util.HashMap;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String s="google";
		
		HashMap<Character, Integer> hs= new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
		if(hs.containsKey(s.charAt(i)))
		{
			int count=hs.get(s.charAt(i));
			hs.put(s.charAt(i), ++count);
		}
		else
		{
			hs.put(s.charAt(i), 1);
		}
		}
		System.out.println(hs);

	}

}

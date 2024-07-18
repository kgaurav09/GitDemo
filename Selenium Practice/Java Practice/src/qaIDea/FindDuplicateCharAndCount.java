package qaIDea;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharAndCount {

	public static void main(String[] args) {
	
		String str="google";
		
		char[] ch= str.toCharArray();
			
		Map<Character, Integer> mp= new HashMap<Character, Integer>();

		for(char ch1:ch)
		{
			
			
			 mp.put(ch1, mp.getOrDefault(ch1, 0) + 1);
			
		}
		
		System.out.println("Duplicate characters and their counts:");
		
		for(Map.Entry<Character, Integer> enrry:mp.entrySet())
			
		{
			if(enrry.getValue()>1)
			{
				System.out.println(enrry.getKey()+"   "+enrry.getValue());
			}
		}
	}

}

package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateElement {

	public static void main(String[] args) {
		int count=0;
		boolean dup=false;
		
		int[] arr = { 4, 5, 6, 3, 4, 6, 8 };
		
		Map<Integer, Integer>mp= new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				count=mp.get(arr[i]);
				mp.put(arr[i], count+1);
			}
			else
			{
				mp.put(arr[i], 1);
			}
			
		}
System.out.println(mp);

for(Entry<Integer, Integer> entry:mp.entrySet())
{
	System.out.println(entry.getKey()+" "+entry.getValue());
	
	if(entry.getValue()>1)
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
		dup=true;
	}
	
	}
if(!dup)
{
	System.out.println("-1");
}
	}

}

package qaIDea;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateElementinArray {

	public static void main(String[] args) {
		
		int[]a=new int[] {1,4,5,6,8,1,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
		Set<Integer> s= new LinkedHashSet<Integer>();
		
		for(Integer b:a)
		{
			s.add(b);
		}
		System.out.println(s);
		
 
	}

}

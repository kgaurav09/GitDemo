package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,1,4};
		
		Set<Integer> s= new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		System.out.println(s);
		

	}

}

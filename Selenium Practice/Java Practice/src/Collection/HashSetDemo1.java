package Collection;

import java.util.Collection;
import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		 HashSet<Integer> hs= new HashSet<Integer>();
		 
		
		// System.out.println(hs.size());
		 hs.add(4);
		 hs.add(2);
		 hs.add(3);
		 hs.add(1);
		 
		 System.out.println(hs);
		 
		 HashSet<Integer> hs2= new HashSet<Integer>();
		 hs2.add(3);
		 hs2.add(4);
		 hs2.add(5);
		 
		 hs.addAll(hs2);
		 
		 //union operation
		 System.out.println("after adding both the set "+hs);
		 
		 hs.retainAll(hs2);
		 System.out.println("it will retain only common element "+hs);
		 
		 

	}

}

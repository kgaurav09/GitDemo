package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlIstDemo3 {

	public static void main(String[] args) {
		
		LinkedList<String> ls= new LinkedList<String>();
		
		//System.out.println(ls.size());
		
		ls.add("dog");
		ls.add("cat");
		ls.add("cow");	
		ls.add("buffalo");
		ls.add("goat");
		
		
		ls.addFirst("elephant");
		ls.addLast("dear");
		
		System.out.println(ls);
		
		/*
		 * for(int i=0;i<ls.size();i++) { System.out.println(ls.get(i)); }
		 */
		
		/*
		 * for(String s:ls) { System.out.println(s); }
		 */
		
		Iterator<String>it=ls.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l= new LinkedList<Integer>();
		l.add(100);
		l.add(200);
		l.add(3);
		l.add(4);
		
		System.out.println(l);
		
		LinkedList<Integer> l2= new LinkedList<Integer>();
		l2.addAll(l);
		l2.add(23);
		System.out.println("after addion of two list "+l2);
	//	l.removeAll(l);
		System.out.println(l);
		Collections.sort(l2);//default ascending order
		
		System.out.println("after sorting in ascending order "+l2);
		
		//if we want in descending order
		
		Collections.sort(l2,Collections.reverseOrder());
		
		System.out.println("after sorting in descending order "+l2);
		
		Collections.shuffle(l2);
		System.out.println("after shuffling "+l2);
	}

}

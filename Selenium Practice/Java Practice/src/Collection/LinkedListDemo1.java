package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		
		//declare
		
		//List l= new LinkedList();
		ArrayList l4= new ArrayList<>();
		
		/*
		 * List<Integer>l1= new LinkedList<>(); ArrayList<String> l3= new
		 * ArrayList<String>();
		 */
		
		l4.add(100);
		l4.add("Shayam");
		l4.add(10.6);
		l4.add('c');
		l4.add(null);
		l4.add(true);
		
		System.out.println(l4);
		
		System.out.println("get nth element from lits " +l4.get(5));
		l4.remove(4);
		System.out.println("after removing of 4th element " +l4);
		
		//System.out.println("after removing of all the element " +l4.removeAll(l4));
		
		System.out.println("to check whether list is empty "+l4.isEmpty());
		
		System.out.println("to add element at sepecific location "+l4.set(3, 'f'));// if we try to add element in empty list then
			System.out.println("to check element at 3rd location "+l4.get(3));																		//will get indexOutOfBoudsException
		
		System.out.println("to check particular element present in list "+l4.contains(l4));
		System.out.println(l4);
	
		
		

	}

}

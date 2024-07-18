package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		//Declare
		
		ArrayList al= new ArrayList();
		//ArrayList<Integer> al1= new ArrayList<Integer>();
		//ArrayList<String>als= new ArrayList<String>();
		
		al.add(10);
		al.add(10.7);
		al.add("Ram");
		al.add('c');
		al.add(true);
		al.add(1, "Shayam");
		
		System.out.println("print all the element present in array list"+al);
		al.remove(1);
		System.out.println("print all the element present in array list"+al);
	
		  al.remove("Ram");//need to check why we can't remove as 'c'
		  System.out.println("print all the element present in array list"+al);
		
		  System.out.println("get the nth element "+al.get(1));
		
		  System.out.println("set the element "+al.set(1, 2));
		  System.out.println("set the element in last of array list "+al.add("Sita"));
		  System.out.println("new array list would be "+al);
		//  System.out.println("after removing all the element "+al.removeAll(al));
		  System.out.println("after removing all the element "+al);// it will return empty list
		  
		  System.out.println("check the size of array " +al.size());
		  System.out.println(al.contains("Sita"));
		  
		  //covert array list to array 
		  
			/*
			 * Object[] objects= al.toArray();
			 * 
			 * for(Object obj:objects) { System.out.println(obj); }
			 */
		 
		 
		//traverse arraylist using for loop
		  
		  for(int i=0;i<al.size();i++)
		  {
			  System.out.println("Using for loop "+al.get(i));
		  }
// traverse through foreach loop
		  
		  for(Object obj:al)
		  {
			  System.out.println("using for each loop "+obj);
		  }
		  
		  //using Iterator interface
		  
		  Iterator<Object> it= al.iterator();
		  
		  while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
	}

}

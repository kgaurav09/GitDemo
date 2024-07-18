package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m=new HashMap<Integer,String>();
		
		m.put(100, "david");
		m.put(101, "smith");
		m.put(102, "abc");
		m.put(103, "xyz");
		m.put(104, "pqr");
		m.put(105, "xyz");
		m.put(104, "ram");
		
		System.out.println(m);
		
		System.out.println(m.get(101));//smith
        System.out.println(m.size());
        System.out.println(m.remove(104));
        System.out.println("after remove  "+m);
        
        System.out.println(m.containsKey(103));
        System.out.println(m.containsKey(104));
        System.out.println(m.containsValue("xyz"));
        
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        
        
        //entry interface
        
      for(Integer i:m.keySet())
        
      {
    	  System.out.println(i);
    	  
    	 
      }
	  
      for(String i:m.values())
          
      {
    	  System.out.println(i);
    	 
      }

      for(Map.Entry<Integer, String>entry:m.entrySet())
      {
    	  System.out.println(entry.getKey()+"    "+entry.getValue());
    	 
      }
      
      //using iterator
      
      Set s=m.entrySet();
      
      Iterator<Entry<Integer, String>> it=s.iterator();
      
      while(it.hasNext())
      {
    	Map.Entry entry=  it.next();
    	
    	System.out.println("Using iterator method print key and value  " +entry.getKey()+"   "+entry.getValue());
      }
	}

}

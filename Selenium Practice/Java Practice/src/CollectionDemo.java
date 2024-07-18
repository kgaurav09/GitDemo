import java.util.ArrayList;

public class CollectionDemo {

	
	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();
		al.add("bbb");
		al.add("gaurav1");
		al.add("ddd");
		System.out.println(al);
		
		ArrayList al2= new ArrayList();
		al2.add("bbb");
		al2.add("gaurav");
		al2.add("ddd");
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al);
		System.out.println(al2);
		
		
	}
}

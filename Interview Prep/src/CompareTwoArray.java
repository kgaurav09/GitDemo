import java.util.ArrayList;

public class CompareTwoArray {

	public static void main(String[] args) {
		 int []a= {1,4,6,9};
		 int []b= {2,4,6,8};
		 ArrayList<Integer>al=new ArrayList<Integer>();
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==b[i])
			 {
				 al.add(a[i]);
			 }
		 }
		 
		 Object[] ob=al.toArray();
		 for (Object obj : ob) {
			 System.out.println(obj);
			
		}

	}

}

package qaIDea;

public class SmallestElementInArray {

	public static void main(String[] args) {
		
		int [] a= new int[]{1,4,5,0,8};
		int smallest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
System.out.println(smallest);
	}

}

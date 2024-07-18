package qaIDea;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int [] a= {1,4,5,0,8};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
		
				if(a[i]>max)
				{
					max=a[i];
				}
		}
		System.out.println(max);

	}

}

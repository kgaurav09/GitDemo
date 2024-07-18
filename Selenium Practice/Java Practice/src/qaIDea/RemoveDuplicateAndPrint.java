package qaIDea;

public class RemoveDuplicateAndPrint {

	public static void main(String[] args) {
		
		int[]a=new int[] {1,4,5,6,8,1,5,6};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]!=a[j])
				{
					a[j++]=a[i];
					
					System.out.println(a[j]);
					
				}
			}
		}

	}

}

import java.util.ArrayList;

public class RemoveDupFromArray {

	public static void main(String[] args) {
		int [] a= {1,2,2,2,3,4,4,6,7,8,8,6,4};
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ar.contains(a[i]))
			{
				ar.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
					
				}
				if (k==1)
				{
					System.out.println(a[i]+"is unique number");
				}
				/*
				 * System.out.println(a[i]); System.out.println(k);
				 */
				
				}
			
			}
		}
			
			

	}



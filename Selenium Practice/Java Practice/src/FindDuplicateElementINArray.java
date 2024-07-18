
public class FindDuplicateElementINArray {

	public static void main(String[] args) {
		
		int b[]= {2,4,5,6,7,4,6,2};
		int count;
		
		for(int i=0;i<b.length;i++)
		{
			count=1;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					count++;
					System.out.println(b[i]);
				
				}
				
			}
			
			
			
			/*
			 * if(count>1) { System.out.println(b[i]); }
			 */
		}

	}

}

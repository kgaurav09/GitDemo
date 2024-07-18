
public class SortAscArray {

	public static void main(String[] args) {
		int q[]= {10,4,5,-8,5,0,8,-10};
		
		for(int i=0;i<q.length;i++)
		{
			for(int j=i+1;j<q.length;j++)
			{
				int temp=0;
				if(q[i]>q[j])
				{
					temp=q[i];
					q[i]=q[j];
					q[j]=temp;
					
				}	
			}
			System.out.println(q[i]);
		}

	}

}

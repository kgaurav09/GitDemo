
public class TwoDimensionArray {

	public static void main(String[] args) {
		int b[][]= new int [2][2];
		
		b[0][0]=8;
		b[0][1]=10;
		b[1][0]=2;
		b[1][1]=5;
		
		for(int i=0;i<b.length;i++)
		{
			
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
			
		}
		

	}

}

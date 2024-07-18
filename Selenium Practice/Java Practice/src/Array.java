import java.io.ObjectInputStream.GetField;

public class Array {

	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5};// these are 2 ways to declare single dimension array
		 
		 Integer b[]= new Integer[5];
		 b[0]=1;
		 b[1]=2;
		 b[2]=4;
		 b[3]=6;
		 
		 int c[][]= new int[3][3];
		 
		 c[0][0]=0;
		 c[0][1]=3;
		 c[0][2]=4;
		 
		 c[1][0]=5;
		 c[1][1]=6;
		 c[1][2]=7;
		 
		 c[2][0]=10;
		 c[2][1]=60;
		 c[2][2]=77;
		 
		 for(int i=0;i<c.length;i++)    //
		 {
			
			
			 for(int j=0;j<c[i].length;j++)
			 {
				 System.out.print(c[i][j]+ "  ");
				 }
			 System.out.println();
		 }
		 

	}

}

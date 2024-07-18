public class PalindromNumber {

	public static void main(String[] args) {
		int i=454;
		int r,sum=0,temp;
		
		temp=i;
		
		while (i>0) {		
			r=i%10;			
			sum=(sum*10)+r; 
			i=i/10;
		}
		
		if(temp==sum)
		{
			System.out.println("number is palindrome");	
			
		}
		else
		{
			System.out.println("number is not palindrome");	
		}
			
		}
		

	}



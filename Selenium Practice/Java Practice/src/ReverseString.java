
public class ReverseString {

	public static void main(String[] args) {
		 String s="Rahul";
		 String t="";
		 
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 t=t+s.charAt(i);	
		 }
		
		System.out.println(t);
		
		 if(!s.equals(t))
		 {
			 System.out.println("its not palindrome");
		 }

	}

}


//int i>=0;i=s.length()-1;i--
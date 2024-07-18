package qaIDea;

public class ReverseOfString {

	public static void main(String[] args) {
		String str="abba";
		String revStr="";
				
			
        for(int i=str.length()-1;i>=0;i--)
        {
        	revStr=revStr+str.charAt(i);
        }
        System.out.println(revStr);
        if(str.equals(revStr))
        {
        	System.out.println("String "+str+" is palindrome with "+revStr);
        }
        else
        {
        	System.out.println("Strings are not palindrome");
        }
	}

}

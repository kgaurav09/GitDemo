
public class CountString {
	
	static int charcount=0;
	static int intcount=0;
	static int spacecount=0;

	public static void main(String[] args) {
		
		String s1= "This is a string 123 @$%";
		
        char[] c1=	s1.toCharArray();
        System.out.println(c1.length);
        
        for(int i=0; i<c1.length;i++)
        {
        boolean answer1=	Character.isAlphabetic(c1[i]);
        boolean answer2= Character.isDigit(c1[i]);
        boolean answer3= Character.isSpaceChar(c1[i]);
       
        if(answer1==true)
        {
        	  charcount++;
        }
        
        if(answer2==true)
        {
        	intcount++;
        }
        
        if(answer3==true)
        {
        	spacecount++;
        }
        }
        System.out.println("Total char count present in given string is"+charcount);
        System.out.println("Total int count present in given string is "+intcount);
        System.out.println("Total space count present in given string is "+spacecount);
        
        int totalSpecailChar= c1.length-(charcount+intcount+spacecount);
        System.out.println(totalSpecailChar);
      
	}

}

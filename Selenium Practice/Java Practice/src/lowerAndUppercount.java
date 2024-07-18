
public class lowerAndUppercount {

	public static void main(String[] args) {
		
		String s= "Welcome To AutomaTion WoRLD";
		
		int lowerCount=0;
		int UpperCount=0;
		String lowerletter="";
		String upperletter="";
		
		for(int i=0;i<s.length();i++)
		{
			 char ch=s.charAt(i);
			 
			 if(ch>=65 && ch<=90)
			 {
				 lowerletter=lowerletter+ch;
				 lowerCount++;
				 
			 }
			 else if(ch>=97 && ch<=122)
			 {
				 upperletter=upperletter+ch;
				 
				 UpperCount++;
			 }
				 
		}
		System.out.println(s.length());
		System.out.println(UpperCount);
		System.out.println(lowerCount);
		System.out.println(upperletter);
		System.out.println(lowerletter);

	}

}

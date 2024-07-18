package interviewQuestions;

public class StringsOutput  {
	
	 

	public static void main(String[] args) {
		
		String s="Shiva";
		
	s.concat("ram");
		
		System.out.println(s);
		
		s=s.concat("ram");
		System.out.println(s);
		
		String s2="hello";//one object will get created in SCP area
		
		String s1=new String("hello");// 1 more object get created in Heap area, and in SCP s1 will also get reference of s1
		
		String s3="hello";
		if(s2==s1)
		{
			System.out.println(true);
		}
		
		
	 
	}
}
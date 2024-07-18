package interviewQuestions;

public class StringComparision {

	public static void main(String[] args) {
		 String s= new String("I Love India");
		 String s1="I Love India";
		 String s3="I Love India";
		 
		 if(s.equals(s1))
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("false");
		 }
		 if(s==s3)
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("false");
		 }
		 
		 if(s3==s1)
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("false");
		 }
	}

}

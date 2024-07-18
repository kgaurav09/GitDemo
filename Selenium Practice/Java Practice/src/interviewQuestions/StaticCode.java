package interviewQuestions;

public class StaticCode {
	int i=10;
	static int j=20;
	void show()
	{
		System.out.println("i  "+i+"  j");
		System.out.println(StaticCode.getInstance());
		
		
	}
	
	static int getInstance()
	{
		return j+1;
	}
	
	

public static void main(String[] args) {
		
		StaticCode sc= new StaticCode();
		sc.show();
		System.out.println(StaticCode.getInstance());

}

}

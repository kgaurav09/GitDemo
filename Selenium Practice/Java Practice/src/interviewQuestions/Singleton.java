package interviewQuestions;

public class Singleton {

	static Singleton st = new Singleton();

	private Singleton() {
		System.out.println("Constructor will invoke for only one object");
	}

	static Singleton getInstance() {
		return st;
	}

}

 class student
{

	public static void main(String[] args) {
		
		Singleton st1= Singleton.getInstance();
		

	}

}

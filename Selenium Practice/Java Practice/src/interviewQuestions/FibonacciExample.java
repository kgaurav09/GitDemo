package interviewQuestions;

public class FibonacciExample {
	static int n1=0,n2=1,n3=0;
	
	static void PrintFibonacci(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			PrintFibonacci(count-1);
		}
		
		
	}

	public static void main(String[] args) {
		
		int count=10;
		System.out.println(n1);
		System.out.println(n2);
		PrintFibonacci(count-2);
		

	}

}

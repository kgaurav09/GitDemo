package interviewQuestions;

public class PrintNumberWithoutUsingAnyLoop {
	
	public static void printNum(int num)
	{
		if(num>0)
		{
			printNum(num-1);
			System.out.println(num+" ");
		}
		return;
	}

	public static void main(String[] args) {
		
		printNum(10);
		
		

	}

}

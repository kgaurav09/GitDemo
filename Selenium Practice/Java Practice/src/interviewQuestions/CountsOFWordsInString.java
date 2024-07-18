package interviewQuestions;

public class CountsOFWordsInString {

	public static void main(String[] args) {
	String str="Spring is beautiful so is summer";
	
	String word="is";
	int count=0;
	String[] temp=str.split("\\s");
	for(int i=0;i<temp.length;i++)
	{
		if(temp[i].equals(word))
		{
			count++;
		}
		
	}
	System.out.println(word +  "  occured "+count+ "times");
	}

}

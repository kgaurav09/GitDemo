package interviewQuestions;

public class OccuranceOfGivenCharacter {
	

	
	public void FindCharCount(String s, char ch)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		OccuranceOfGivenCharacter cc= new OccuranceOfGivenCharacter();
		cc.FindCharCount("RamAndSita", 'a');
	

	}

}

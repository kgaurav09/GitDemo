package interviewQuestions;

public class OccuranceOFWord {

	public static void main(String[] args) {
		
		String s="This in a duplicate string to check maximum occurance of a word in string a";
		
		s.toLowerCase();
		
		String[] s1=s.split(" ");
		
		int count=1;
		for(int i=0;i<s1.length;i++)
		{
			count=1;
		for(int j=i+1;j<s1.length;j++)
		{
			if(s1[i].equals(s1[j]))
			{
				count++;
				s1[j]="0";
			}
			
		}
		
		if((count)>1 && s1[i]!="0")
		{
			System.out.println(s1[i]+"  count "+count);
		}
		
	}
	}
}

package interviewQuestions;

import java.util.Iterator;

public class Duplicate_CharcterIn_String {

	public static void main(String[] args) {
		
		String s="This is duplicate charcter check in string";
		int count;
	
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			count=1;
			
			
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]==c[j]&&c[i]!=' ')
				{
					count++;
					c[j]='0';
					
				}
			}
			if(count>1 && c[i]!='0')
			{
				
				System.out.print(c[i]);
			}
		}
	}

}

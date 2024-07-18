
public class DuplicateCharInString {

	public static void main(String[] args) {
	
		String str="Great Responsibility";
	    int count;
		char string[]=str.toCharArray();
		
		for(int i=0;i<string.length;i++)
		{
			count = 1;
			for(int j=i+1;j<string.length;j++)
			{
				
			     if(string[i] == string[j] && string[i] != ' ') 
			     {  
			    	 count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                } 
			}
			
			if(count>1 && string[i]!='0')
			{
				System.out.print(string[i]+" ");
				System.out.print(count);
				
			}
			//System.out.println();
		}
			
		}

		

}

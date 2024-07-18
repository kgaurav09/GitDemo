
public class CountVowelConstant {

	public static void main(String[] args) {
		
		String Str="This is simple Sentence";
		int vCount=0, cCount=0;
		
		Str=Str.toLowerCase();
		
		for(int i=0;i<Str.length();i++)
		{
			if(Str.charAt(i)=='a'||Str.charAt(i)=='e'||Str.charAt(i)=='i'||Str.charAt(i)=='o'||Str.charAt(i)=='u')
			{
				System.out.println(Str.charAt(i));
				vCount++;
				
			}
			else if (Str.charAt(i)>'a' && Str.charAt(i)<'z') {
				//System.out.println(Str.charAt(i));
				cCount++;
				
			}
		}
		System.out.println("Number of vowels count"+vCount);
		System.out.println("Number of vowels count"+cCount);
		

	}

}

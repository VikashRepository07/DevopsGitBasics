package leetcode;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "@vi-k^a";
		System.out.println(reverseOnlLetters(s));

	}

	
	public static String reverseOnlLetters(String s)
	{
	//char temp;
	int start=0;
	int end = s.length()-1;
	char ch[] =s.toCharArray();
	while(start<end)
	{
		
		if(!Character.isLetter(ch[start]))
	    	{
		       start++;
		    }
		else if(!Character.isLetter(ch[end]))
		    {
			end--;
			
		    }
		else 
		   {
			char temp = ch[start];
			ch[start] = ch[end];
			//ch[end] = ch[temp];;//need to do this mistake in program in asked in interview
			ch[end] = temp;
			
			start++;
			end--;
		 
			
			
		   }
		}
	return new String(ch);
	
		
		
		
		
	
	
}
}
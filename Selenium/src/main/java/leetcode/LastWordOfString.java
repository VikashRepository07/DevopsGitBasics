package leetcode;

public class LastWordOfString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str  = "  fly to the moon ";
		//LengthOfLastword(str);
		System.out.println(LengthOfLastword(str));
		

	}
	
 
	public static int LengthOfLastword(String input)
  
  {
	  
	  String str =input.trim();
	  int count = 0;
	  
	  for(int i=str.length()-1;i>=0;i-- )
		  
	  {
		  
		  if(str.charAt(i)!=' ')
		  {  count++;}
		  else 
			  
		  {
			  break;
		  }
		  
		// return count;
	  }
	  return count;  
  }


	
	
	
}

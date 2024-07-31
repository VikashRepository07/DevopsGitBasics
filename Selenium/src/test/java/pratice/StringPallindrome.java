package pratice;

public class StringPallindrome {
	
	
	
	public static boolean checkPallindrome(String s)
	{
		int left=0,right=s.length()-1;
		
		
		while(left<right)
		{
			if(!(s.charAt(left)==s.charAt(right)))		
				
			{
				System.out.println(s.charAt(left));
			System.out.println(s.charAt(right));
				return false;
				}
			
		left++;
		right--;
		
			}
	
				return true;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("is the string is pallindorme"+StringPallindrome.checkPallindrome("vikav"));
		System.out.println("is the string is pallindorme"+StringPallindrome.checkPallindrome("naman"));
		int a[] = {1,3,2};
	
	}

}

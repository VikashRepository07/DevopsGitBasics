package leetcode;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "vikash";
		System.out.println(reverseOnlyVowel(s));

	}

	
	
	
	
	
	public static String reverseOnlyVowel(String s )
	{
		
		int start =0;
		int end = s.length()-1;
		char arr[] = s.toCharArray();
		
		while(start>end)
		{
		
			if(!(arr[start]=='A' ||arr[start]=='a'||arr[start]=='e'||arr[start]=='i'||arr[start]=='o'||arr[start]=='u'))
			{
				start++;
				
			}
				
			else if(!(arr[end]=='A' ||arr[end]=='a'||arr[end]=='e'||arr[end]=='i'||arr[end]=='o'||arr[end]=='u'))
		    {
			end--;
			
			
	      	}
			else 
			{
				 char temp = arr[start];
				 arr[start]= arr[end];
				 arr[end]= temp;
				 
			}
	}
	
	
	return  new String(arr);
}
	}

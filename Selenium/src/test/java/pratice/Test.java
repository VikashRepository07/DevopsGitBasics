package pratice;

import java.util.Arrays;
import java.util.HashMap;

import org.checkerframework.checker.units.qual.Length;

public class Test {
	
	
	public static boolean isArmStrong(int num)
	{
	    int temp = num;
		int rem;
	    int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum = sum +(rem*rem*rem);
			num=num/10;
			
		//System.out.println(sum);
		}
		
		System.out.println(sum);
		System.out.println(num);
        if(temp==sum)	
        {
        	return true;
        }
		return false;
		
	}

	public static void main(String[] args) {
	
		String str = "12321";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
		char[] ch = str.toCharArray();
		//Arrays.sort(ch);
		System.out.println(ch);	
		int left =0;
		int right =ch.length-1;
		while(left<right)
		{
			if(ch[left]!=ch[right])
			{System.out.println("not pallindrome");
			return;}
					//	char temp = ch[left];
		//	ch[left] = ch[right];
		//	ch[right] =temp ;
		    left++;
		    right--;
		}
		System.out.println("Pallindrome");
		
		
		}
}
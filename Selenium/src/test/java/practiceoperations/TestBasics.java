package practiceoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TestBasics {

	
	
	
	
	public static int getMaxminFromList(int[] arr)
	{
		int max = arr[0];
		for(int i =0;i<=arr.length-1;i++)
		{
			if(max>arr[i])
			{
				max=arr[i];
			}
		}
		
		return max;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="124536";
		char[] c= s.toCharArray();
		
		int [] numbers = {2,3,16,7,3,8,9,12};
	int n=	TestBasics.getMaxminFromList(numbers);
		System.out.println(n);
		
		
		
		
		
}
}
package week8day1;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev =0, rem;
		int temp;

	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num =sc.nextInt();
		
		temp =num;
		
		if (num==0)
			throw new IllegalArgumentException("Null is not valid input ok");

		while(num!=0)
		{
			
			rem = num%10;
		rev = (rev*10)+rem;
		num = num/10;
		}
        System.out.println(rev);
        
        if(rev==temp)
        	System.out.println("Pallindrome");
	}

}

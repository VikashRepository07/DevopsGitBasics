package week8day1;

import java.util.Scanner;

public class Pallindorme {

	public static void main(String[] args) {
		
		
		int sum = 0, temp ,rem;
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check");
		int num  = sc.nextInt();
		
		temp = num;
	/*	 while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;   
		*/
		while(num>0)
		{
			
			rem = num%10;
			sum = sum*10+rem;
			num=num/10;
			
			
		}
		
		if(sum==temp)
			System.out.println("Pallindrome");
		else
			System.out.println("not Pallindrome");
		
		
		
		
	}

}
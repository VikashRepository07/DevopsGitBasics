package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
				//int num = sc.nextInt();
		        int num =4;
				int count =0;
				if (num>1)
				{
					for (int i=1;i<=num;i++)
					{
						if(num%i ==0)
						{
							count++;
					
						}
						
					}
					
						if(count==2)	
						   {
							System.out.println("prime");
							}
						
						else 
							{
							System.out.println("not prime");
							}
					
					}
					
					else 
						System.out.println("no  prime less than one ");
					
					
					
					
				}

	}



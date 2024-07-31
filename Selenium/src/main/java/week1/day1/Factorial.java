package week1.day1;

public class Factorial {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		int input = 6;
		int fact =1;
		int fact1 =1 ;
		
		for(int i=1;i<=input;i++)
		
		//for(int i=input; i>0;i--)
		{
			fact =fact*i;
		
	//	System.out.println(fact);
		}
	//	System.out.println("The factorial of "+input+" is "+fact);
			
			for (int j =input ;j>0;j--)
			{	
				fact =fact*j;
			
			System.out.println(fact);
			}
			System.out.println(fact);
			
			
	}

}

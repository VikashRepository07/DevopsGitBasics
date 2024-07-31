package pratice;

public class PrimeNumber {

	
	
	
	public static boolean findPrimeNumber(int num)
	{
		int count =0;
		if(num>1)
		{
			for(int i =2;i<=num;i++)
				if(num%i==0)
				{
					count++;
				}
				if(count==1)
				return true;
				else 
					return false;
			
		}
		
		else 
		
		return false;
		
		
	}
	
	public static void main(String[] args) {
		
		
		//logic is the number should be greater than 1 
		//it  can only be divided by 1 and himself
			System.out.println("is the number is prime"+PrimeNumber.findPrimeNumber(4));
			
	

	}

}

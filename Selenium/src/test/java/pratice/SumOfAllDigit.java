package pratice;

public class SumOfAllDigit {

	public static int sumofAlldigit(int num)
	{
		int sum = 0;
		int rem =0;
       // int num = 123456;

        while(num !=0)
        {
        rem = num%10;
        sum = sum +rem;
        num = num/10;
		
			
			//System.out.println(sum);
			}
			return sum;
	}
		
	
			
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//System.out.println(Test.sumofAlldigit(12345)));
			int result = SumOfAllDigit.sumofAlldigit(12345);
			
			if(result>9)
			{
		//int result1 =Test.sumofAlldigit(result);
			
		{
			
				System.out.println(SumOfAllDigit.sumofAlldigit(result));
		//	System.out.println(result1);

	}}}

}

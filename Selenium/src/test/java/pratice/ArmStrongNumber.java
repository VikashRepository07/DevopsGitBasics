package pratice;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//An Armstrong Number is a number in which  
		//the sum of the cubes of each digit is equal to the number itself.
		
		int num =371;
		int rem;
	   int  sum=0;
		while(num>0)
		{
			rem=num%10;
			sum = sum +rem*rem*rem;
			num=num/10;
			
		System.out.println(sum);
		}
		
		if(num==sum)
		{
		System.out.println("Yes number is armStrong");
	}
		}

}

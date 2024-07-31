package pratice;

public class PallindormeNumber {

	
	public static boolean checkPallindorme(int n)
	{
		int sum=0;
		int rem;
		int temp = n;
		while(n>0)
		{
			rem =n%10;
			sum =sum*10+rem;
			n=n/10;
		//	System.out.println(sum);
		}
		//System.out.println(sum);
		
		if(temp==sum)
			return true ;
			else 
				return false ;
						
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	System.out.println("the numbers is palindrome "+PallindormeNumber.checkPallindorme(121));
    boolean b = 	PallindormeNumber.checkPallindorme(1213);
    System.out.println(b);
	}}
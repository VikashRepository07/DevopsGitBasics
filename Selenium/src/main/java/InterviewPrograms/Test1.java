package InterviewPrograms;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String input ="I am an icertian";
		int input = 375427;
		//if sum is two digit number find the sum again
	
			
		int sum=0;
		int sum2 =0;
		int sum3=0;
		while(input>0)
		{	
		sum =  sum + input%10;
		input = input/10;
		//System.out.println(sum);
		
		}
		
		
		while(sum>0)
		{	
				sum2= sum2 + sum%10;
			    sum =sum/10;
		      //System.out.println(sum2);

		}
		
		while(sum2>0)
		{	
				sum3= sum3 + sum2%10;
			    sum2 =sum2/10;
		    //  System.out.println(sum3);

		}

		System.out.println(sum3);
		}
		
		
		
	
		
		
		

	}



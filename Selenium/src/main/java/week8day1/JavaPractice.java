package week8day1;

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char reverse;
		String reverseString ="";
		
		
		/*System.out.print("Enter first number- "); 
		int a = sc.nextInt();
		System.out.print("Enter seond number- "); 
       int b = sc.nextInt();
       
       System.out.println("Enter third Number-");
       int c = sc.nextInt();
       
       int sum = a+b+c;
       System.out.println(sum);
       */
       System.out.print("Enter a string: ");  
       String str = sc.nextLine();
       
       System.out.println("you have entered string"+str);
       
       int length = str.length();
      for(int i=0;i<length;i++)
    	//   for(int i=length-1; i>=0; i-- )
       {
    	   char ch = str.charAt(i);
       System.out.println(ch);
       reverseString = ch+reverseString;
         
   //  System.out.println(reverseString);
	}
    System.out.println(reverseString);
    System.out.println(str);
    
    
    if(str.equalsIgnoreCase(reverseString))
    	System.out.println("String is pallindrome");
    else 
    	System.out.println("String is not pallindorme");
    
    
	}
}

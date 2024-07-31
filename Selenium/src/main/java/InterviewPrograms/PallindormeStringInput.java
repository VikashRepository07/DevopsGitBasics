package InterviewPrograms;

import java.util.Scanner;

import org.openqa.selenium.support.ui.WebDriverWait;

public class PallindormeStringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String name = sc.nextLine();
		
		if(name==null)
		
		throw new IllegalArgumentException("null is not valid input");
	    
		
		for(int i = 0; i<name.length();i++)
		{
		reverse = name.charAt(i)+reverse;
		//	reverse = reverse+ name.charAt(i);
			
		}
		
	    System.out.println(reverse);
	   
	}

}

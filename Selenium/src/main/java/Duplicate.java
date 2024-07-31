import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int count=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check ");
		String inputStr = sc.nextLine();
		char[] ch = inputStr.toCharArray();
		
		for(int i=0;i<inputStr.length();i++)
		{
		
	
			for(int j=i+1;j<inputStr.length();j++)
			{
	     	if(ch[i]==ch[j])
		//	if(inputStr.charAt(i)==inputStr.charAt(j))	
			    {
				 count++;
			    }
	     	
				 if(count>1)
				 {
			//	System.out.println("Duplicaye is :"+inputStr.charAt(j));
				System.out.println("Duplicate is :"+ch[j]+" with frequency"+count+"");
				break;

			    }
			}
			
		}	
		
	}

}

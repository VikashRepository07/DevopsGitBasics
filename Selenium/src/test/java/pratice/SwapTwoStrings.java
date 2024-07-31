package pratice;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Vikas";
		String str2 = "shruthi";
		//combine both string using concenation operator 
		str1 = str1+str2;
		System.out.println(str1);
		System.out.println(str1.length());
		
		str2 =str1.substring(0, str1.length()-str2.length());
		//System.out.println(str2);
		
		str1= str1.substring(str2.length());
		//System.out.println(str1);
		
	System.out.println("the first string is  "+str1+" and the second string is "+str2 );
	}

}

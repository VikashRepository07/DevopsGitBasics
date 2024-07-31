package week1.day1;

public class Mobile {
	String mobileBrandName = "Nokia";
	char mobileLogo = 'N';
	short noOfmobilePiece = 5;
	int modelNumber = 2210;
	Long mobileNumber = 1234567890l;
	float mobilePrice = 10000;
	boolean isDamaged = false;
	
	
	
	
public void makeCall() {
	// TODO Auto-generated method stub

	// CNTL+SPACE shortcut to create class 
	System.out.println("Please make a phone call for me ");// CTRL +Space +ENTER shortcut 
	
}
public void sendMsg() {
	// TODO Auto-generated method stub

	// CNTL+SPACE shortcut to create class 
	System.out.println("Please send a message for me");// CTRL +Space +ENTER shortcut 
	
}
public static void main(String[] args) {
	


	Mobile myMobile = new Mobile();
	
	//myMobile.makeCall();
//	myMobile.sendMsg();
	
	System.out.println("The mobile brand name is "+myMobile.mobileBrandName);
	System.out.println("The mobile brand logo is "+myMobile.mobileLogo);
	System.out.println("The mobile price is  is "+myMobile.mobilePrice);
	System.out.println("The mobile call number is "+myMobile.mobileNumber);
	System.out.println("The total qunatity is "+myMobile.noOfmobilePiece);
	System.out.println("The mobile model number  is "+myMobile.modelNumber);
	System.out.println("The mobile  is  damaged "+myMobile.isDamaged);
	System.out.println("The mobile brand name is "+myMobile.mobileBrandName);
}


	

	
}

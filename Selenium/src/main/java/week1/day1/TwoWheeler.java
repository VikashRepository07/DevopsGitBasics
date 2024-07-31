package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 4;
	long chassisNumber = 123456789l;
	boolean isPunctured = false ;
	String bikeName =  "Java";
	double runningKM  = 245;
	
	public static void main(String[] args) {
	
		
		
		TwoWheeler bike = new TwoWheeler();
		
	//	System.out.println("The vehicle has number  of wheels:"+ noOfWheels);
	//	bike.noOfWheels
		System.out.println("The vehicle has number  of wheels:"+ bike.noOfWheels);
		System.out.println("The vehicle has number  of Mirrors:"+ bike.noOfMirrors);
		System.out.println("The vehicle  is puntured : "+bike.isPunctured+ ":");
		System.out.println("The vehicle name is :"+ bike.bikeName);
		System.out.println("The vehicle has total run in kilometer:"+ bike.runningKM);

		if(bike.isPunctured)
			System.out.println("The vechicle is   puntured");
		else 
			System.out.println("The vechicle is not  puntured ");
	}
}

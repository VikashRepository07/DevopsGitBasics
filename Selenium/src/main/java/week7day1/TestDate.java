package week7day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 
			 // Create object of SimpleDateFormat class and decide the format
			 DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
			// DateFormat dateFormat = new SimpleDateFormat();
			 //get current date time with Date()
		      Date date = new Date();
			 
			 // Now format the date
			  String date1= dateFormat.format(date);
			 
			 // Print the Date
			 System.out.println(date1);
			 

	}

}

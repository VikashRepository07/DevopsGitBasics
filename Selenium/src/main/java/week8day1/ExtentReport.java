package week8day1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	
	public static void main(String[] args) {
	
	
//Create an object for ExtentReports
	
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/createLead");
	
	
	
	//Create an object for ExtentReports
	ExtentReports extent = new ExtentReports();
	
	
	
	
	//Attach it to the physical report
	extent.attachReporter(reporter);
	
	//Create a test case 
     ExtentTest test = extent.createTest("create lead", "need to create lead");
     test.assignCategory("Regression");
     test.assignAuthor("Vikash");
     
     //provide step level description 
     test.pass("Enter username");
     test.pass("enterpassword");
     test.pass("click Login");
     extent.flush();
     
     
     

	
	
	}
	
	

}

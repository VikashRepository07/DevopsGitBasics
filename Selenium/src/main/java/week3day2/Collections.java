package week3day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Collections {
	
	
	public static void main(String[] args) {
	
	//WebDriverManager.chromedriver().setup();
	 WebDriverManager.chromedriver().setup();
	//WebDriverManager.ChromeDriver.setup
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	driver.findElement(By.id("nav-search-submit-button")).click();
	WebElement firstElement =driver.findElement(By.xpath("//span[@class ='a-price-whole']"));
	
	List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class ='a-price-whole']"));
	
     System.out.println(allPrices.size());
     for (WebElement price :allPrices);
	

	
	
	

	}
	
}

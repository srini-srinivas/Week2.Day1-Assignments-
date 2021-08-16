package Week2.Day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SalesForce {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.findElement(By.name("UserFirstName")).sendKeys("Srinivas");
	
	driver.findElement(By.name("UserLastName")).sendKeys("S");
	
	//UserEmail
	
	driver.findElement(By.name("UserEmail")).sendKeys("srinisrinivas69@gmail.com");
	
	//UserTitle
	
	 WebElement inputBox = driver.findElement(By.name("UserTitle"));
	 
	 Select drpDwn = new Select(inputBox);

	 drpDwn.selectByIndex(8);

	 
	 //CompanyName
	 
	 driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
	 
	 //CompanyEmployees
	 
	 WebElement inputBox1 = driver.findElement(By.name("CompanyEmployees"));
	 
	 Select drpDwn1 = new Select(inputBox1);
	 
	 drpDwn1.selectByValue("75");
	 
	 //UserPhone
	 
	 driver.findElement(By.name("UserPhone")).sendKeys("9080491711");
	 
	 //CompanyCountry
	 
	 WebElement inputBox2 = driver.findElement(By.name("CompanyCountry"));
	 
	 Select drpDwn2 = new Select(inputBox2);
	 
	 drpDwn2.selectByIndex(36);
	 
	 //SubscriptionAgreement
	 
	 
}
	 	 
	}

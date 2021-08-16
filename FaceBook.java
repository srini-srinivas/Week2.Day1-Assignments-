package Week2.Day1.Assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Srinivas");
		
		driver.findElement(By.name("lastname")).sendKeys("S");
		
		driver.findElement(By.name("reg_email__")).sendKeys("srinisrinivas@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("srinisrinivas@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("p@ssw0rd");
	
		 
		WebElement drop1 = driver.findElement(By.name("birthday_day"));
		 
		 Select drpDwn = new Select(drop1);
		 
		 drpDwn.selectByValue("31");
		 
       WebElement drop2 = driver.findElement(By.name("birthday_month"));
		 
		 Select drpDwn1 = new Select(drop2);
		 
		 drpDwn1.selectByVisibleText("may");
		 
       WebElement drop3 = driver.findElement(By.name("birthday_year"));
		 
		 Select drpDwn2 = new Select(drop3);
		 
		 drpDwn2.selectByValue("1999");
		 
	   	 
		 
	   driver.close();	 
 

	
	}

}



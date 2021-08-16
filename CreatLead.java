package Week2.Day1.Assignment;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatLead {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srinivas");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		 
		 String title = "My Home | opentaps CRM";
			String homeTitle = driver.getTitle();

			if(title.equals(homeTitle)) {
				System.out.println(" In the Home Page");
			}
			else {
				System.out.println(" Not in the Home page");
			}
			
		driver.close();
		}


}

package homepagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	WebDriver driver;
	@BeforeMethod
	public void DriverInitialisation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("https://www.villaselect.com/");
		
		
		
		
	}
	/*@AfterMethod
	public void Driverclose() {
		driver.quit();*/

	
	//}

}

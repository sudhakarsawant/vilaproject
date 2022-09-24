package dreammm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cricket {
	

	@Test
	public void sham() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.quit();
	}
	@Test
	public void ram() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.quit();
		
	}

}

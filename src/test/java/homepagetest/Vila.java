package homepagetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Vila {
	
	@Test
	public void testing() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.villaselect.com/");
		
		driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[2]/div/div/div/button")).click();
		
		//Thread.sleep(5000);
		
		//driver.findElement(By.className("selectize-input items has-options not-full")).click();
		
		//aa.click();
		
		//Select sel=new Select(aa);
		//sel.selectByIndex(2);
	}

}

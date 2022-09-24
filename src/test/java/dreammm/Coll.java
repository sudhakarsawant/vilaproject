package dreammm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Coll {
	@Test
	public void app() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//driver.findElement(RelativeLocator.with((By.xpath("//div[(text()='Beauty')]"))).below(By.xpath("//input[@class='_3704LK']"))).click();
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.linkText("Recruitment")).click();
		
		//WebElement dropdown=driver.findElement(By.name("candidateSearch[jobVacancy]"));
		// Select sel=new Select(dropdown);
		// sel.selectByValue("4");
		 //sel.selectByVisibleText("Ramu");
		// List<WebElement> list=sel.getOptions();
		// for(int i=0;i<list.size();i++) {
			// System.out.println(list.get(i).getAttribute("value"));
		 //}
	}

}

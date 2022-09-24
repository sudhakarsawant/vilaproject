package dreammm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hrku {
	@Test
	public void web() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.navigate().to("https://jqueryui.com/droppable/");
		List<WebElement> list= driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		driver.switchTo().frame(0);
		WebElement a=driver.findElement(By.id("draggable"));
		WebElement b=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(a, b).perform();
		
		
		
	}

}

package dreammm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Trying {
	@Test
	public void tryin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	
		WebDriver driver;
	   driver=new ChromeDriver();
	   //driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.name("Submit")).click();
	  // driver.findElement(By.xpath("//img[@src='/webres_62dd540284d461.98174388/orangehrmLeavePlugin/images/ApplyLeave.png']")).click();
	  // WebElement ele=driver.findElement(By.xpath("//a[contains(@id,'recruitment')]"));
	  // Actions action=new Actions(driver);
	  // action.moveToElement(ele).perform();
	 //  driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewJobVacancy\"]")).click();
	   
	   WebElement ele1=driver.findElement(By.xpath("//*[@id=\"menu_time_viewTimeModule\"]"));
	  WebElement ele2= driver.findElement(By.xpath("//*[@id=\"menu_attendance_Attendance\"]"));
	   Actions act= new Actions(driver);
	   act.moveToElement(ele1);
	   act.moveToElement(ele2);
	   act.build().perform();
	   driver.findElement(By.xpath("//*[@id=\"menu_attendance_viewMyAttendanceRecord\"]")).click();
	  WebElement aa= driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]"));
	Actions ac=new Actions(driver);
	ac.contextClick(aa).perform();
	  
	  //List<WebElement> list= driver.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));
	 // for(WebElement e : list) {
		//  e.click();
	 // }
	  //for(int i=0;i<3;i++) {
		//  list.get(i).click();
	 // }
	 //  driver.findElement(By.linkText("My Info")).click();
	   //driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	   //driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
	  //Thread.sleep(3000);
	 // driver.quit();
	  
	  
	   
	
		
		
	}

}
package Teatng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Valid {
	WebDriver driver;
  @Test(groups = { "smoke" })
  public void login() {
	 
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  //driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	  
  }
  @Test(groups = { "regression" })
  public void myinfo() {
		 
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	  
  }
  @Test(groups = { "smoke" })
  public void requirtment() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
	  
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  driver.quit();
  }

}

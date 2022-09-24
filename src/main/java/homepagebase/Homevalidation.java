package homepagebase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Homevalidation  {
	
//	@FindBy(xpath="//img[@class='vs_logo ls-is-cached lazyloaded']")
  //   public WebElement vilaselectlogo;
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/form/div[2]/div/div[1]")
	public WebElement Dropdown;
	
	@FindBy(xpath="//*[@id=\"input-departureDate\"]")
	public WebElement datedropdown;
	
	@FindBy(xpath="/html/body/div[15]/div/div/div/div[2]/div[19]")
	public WebElement selectdate;
	
	@FindBy(xpath="//*[@id=\"main_search_submit\"]")
	public WebElement searchbutton;
	@Test
	public void searchingFunctionality() {
		
		//vilaselectlogo.isDisplayed();
		Select sel=new Select(Dropdown);
		sel.selectByIndex(2);
		datedropdown.click();
		 selectdate.click();
		 searchbutton.click();
		 
		
		
		
		
		
	}
	
}



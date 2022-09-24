package dreammm;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Edge {
	
	@Test
	public void edge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver;
		driver=new EdgeDriver();
		
		//driver.get("https://www.bing.com/search?q=flipkart&cvid=efb46087660e47a9a0bf5f248232a1bd&aqs=edge.0.46j69i57j0l7.2468j0j1&pglt=41&FORM=ANSPA1&PC=U531");
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

}

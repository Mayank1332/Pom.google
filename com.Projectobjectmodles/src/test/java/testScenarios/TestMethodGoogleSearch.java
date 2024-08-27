package testScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GoogleSearchPage;

public class TestMethodGoogleSearch {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

}
	@Test
	public void searchOperation()  throws InterruptedException{
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.searchGoogle("facebook");
		
		
	}
	
	@AfterTest
	public void aftertest() {
		driver.close();
	}
}
package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
		
	}
     By searchbox=By.xpath("//input[@id='input']");
     
     
    public void searchGoogle(String searchinput) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(searchbox).sendKeys(searchinput);
		
	}
}

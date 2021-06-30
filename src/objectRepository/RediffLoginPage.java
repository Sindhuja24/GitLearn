package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public  RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By username= By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By signin =By.name("proceed");
	
	public WebElement EmailId() {
		 
		return driver.findElement(username);
		
	}
	
	public WebElement password() {
		 
		return driver.findElement(password);
		
	}
	public WebElement signin() {
		 
		return driver.findElement(signin);
		
	}
	

}

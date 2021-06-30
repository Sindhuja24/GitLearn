package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffDotCom {
	WebDriver driver;
	/*By username= By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By signin =By.name("proceed");*/
	
	public RediffDotCom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'rediff.com')]")
	WebElement rediffhome;
	
	@FindBy(id="srchword")
	WebElement search;
	
	public WebElement rediffhome() {
		 
		return rediffhome;
		
	}
	
	public WebElement search() {
		 
		return search;
		
	}
		
}


package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffDotCom;
import objectRepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindh\\Documents\\Project downloads\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.password().sendKeys("1234");
		rd.signin().click();
		
		RediffDotCom rc = new RediffDotCom(driver);
		rc.rediffhome().click();
		rc.search().sendKeys("Home decor");
	}

	
	
}

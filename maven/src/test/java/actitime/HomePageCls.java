package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageCls {
	public static WebDriver driver;
	
    @Test
	public void validLogin()  {
    	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/");
		//LoginPage l=new LoginPage(driver);
	   // l.setLogin("admin", "manager");
	}

}

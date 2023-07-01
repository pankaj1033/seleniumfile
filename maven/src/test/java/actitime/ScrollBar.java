package actitime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000)");
		

	}

}

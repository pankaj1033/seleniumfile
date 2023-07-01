package actitime;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/ss.png");
		FileUtils.copyFile(src, dest);
		driver.quit();
		

	}

}

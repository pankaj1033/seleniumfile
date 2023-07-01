package actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllSelectedOption {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/panka/OneDrive/Desktop/MultiselectListBox.html");
        WebElement mtrListbox = driver.findElement(By.id("mtr"));
        Select s=new Select(mtrListbox);
        List<WebElement> allOptions = s.getAllSelectedOptions();
        int count = allOptions.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
      	  String text = allOptions.get(i).getText();
      	  System.out.println(text);
        }
        driver.close();
	}	
	}



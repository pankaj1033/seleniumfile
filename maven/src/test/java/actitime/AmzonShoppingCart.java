package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzonShoppingCart {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		search_input = driver.find_element(By.ID, 'twotabsearchtextbox')
				search_input.send_keys('Wrist Watches');
		display_filter = driver.find_element(By.XPATH, "//span[text()='Display']/following-sibling::div//span[text()='Analogue']")
				display_filter.click();
				display_filter = driver.find_element(By.XPATH, "//span[text()='Display']/following-sibling::div//span[text()='Analogue']")
				display_filter.click();
		material_filter = driver.find_element(By.XPATH, "//span[text()='Material']/following-sibling::div//span[text()='Leather']")
				material_filter.click();
		brand_filter = driver.find_element(By.XPATH, "//span[text()='Brand']/following-sibling::div//span[text()='Titan']")
				brand_filter.click();
		discount_filter = driver.find_element(By.XPATH, "//span[text()='25% Off or more']/preceding-sibling::input")
				discount_filter.click();	
		search_button = driver.find_element(By.ID, 'nav-search-submit-button')
				search_button.click();
				driver.implicitly_wait(5)
		search_results = driver.find_elements(By.CSS_SELECTOR, 'span.a-size-medium.a-color-base.a-text-normal')
		if len(search_results) >= 5:
		    fifth_element = search_results[4].text
		    print(f"The fifth element from the search results is: {fifth_element}")
		else:
		    print("There are fewer than five elements in the search results.")
		    driver.quit();
	}

}

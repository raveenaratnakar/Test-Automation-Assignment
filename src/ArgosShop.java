/**
 * ArgosShop class defines the logic to navigate to 'Argos' website and adds two expensive items to the basket from the Laptop's category.
 * 
 * @author r.ratnakar
 */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.argos.test.Constants;

public class ArgosShop implements Constants {
	
	static WebElement element;
	/**
	 * Main method.
	 * @param args
	 */

	public static void main(String[] args) {
		
		try {
		// Launches the Chrome Browser.
		String path = "/Users/jelly/Documents/Chrome/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		// Navigates to the Argos Website.
		driver.get("https://www.argos.co.uk/");
		
		//Clicks on the Shop Menu
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(SHOP));
		element.click();
		
		//Clicks on the Technology Option
		try {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(TECHNOLOGY));
		element.click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			element = driver.findElement(By.xpath(TECHNOLOGY));
			element.click();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Clicks on the Laptop Option
		element = driver.findElement(By.xpath(LAPTOP));
		element.click();
		
		//Clicks on the Macbook option
		element = driver.findElement(By.xpath(MACBOOK));
		element.click();
		
		//Clicks on the dropdown and selects the option "High to Low" so as to sort the list of laptops based on Price.
		WebElement e = driver.findElement(By.id(RELEVANCE)); 
		Select o = new Select(e);
		o.selectByIndex(2); 
		
		//Adds the first expensive item of the list
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(ADD_FIRST_ITEM));
		element.click();
		
		//After adding the item clicks on the continue shopping button.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(CONTINUE_SHOPPING));
		element.click();
		
		//Adds the second expensive item of the list
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(ADD_SECOND_ITEM));
		element.click();
		
		//After adding the second item navigates to the basket page.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.linkText(TROLLEY));
		element.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.close();
		System.out.println("Success");
		}catch(Exception e) {
		e.printStackTrace();
	}
	}
}

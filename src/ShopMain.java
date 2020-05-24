import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShopMain {

	static WebElement element;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/Users/jelly/Documents/Chrome/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
	
		WebDriver driver = new ChromeDriver();
		
		try {
		
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.co.uk/");
		/* element = driver.findElement(By.xpath(("//span[text()='Hello, Sign in']")));
		element.click();

		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 element = driver.findElement(By.id("ap_email"));
		 element.sendKeys("tuser0257@gmail.com");

		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 element = driver.findElement(By.xpath(("(//input[@id='continue'])[1]")));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 element = driver.findElement(By.id("ap_password"));
		 element.sendKeys("test123user");
		 element= driver.findElement(By.id("signInSubmit"));
		 element.click();
		 */
		
		 //Add first expensive item
		 element = driver.findElement(By.cssSelector("a#nav-hamburger-menu>i"));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 element = driver.findElement(By.xpath("//div[text()='Electronics & Computers']"));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 element = driver.findElement(By.linkText("Laptops"));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 element = driver.findElement(By.xpath("(//a[@class='a-link-normal']//span)[1]"));
		 element.click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 element= driver.findElement(By.id("a-autoid-0-announce"));
		 element.click();
		 
		 element = driver.findElement(By.linkText("Price: High to Low"));
		 element.click();
		 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 element = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']//span)[3]"));
		 element.click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 element = driver.findElement(By.id("add-to-cart-button"));
		 element.click();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 //Add second expensive item
		 
		 
		// driver.navigate().back();
		 //driver.navigate().back();

		 element = driver.findElement(By.cssSelector("a#nav-hamburger-menu>i"));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 element = driver.findElement(By.xpath("//div[text()='Electronics & Computers']"));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 element = driver.findElement(By.linkText("Laptops"));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 element = driver.findElement(By.xpath("(//a[@class='a-link-normal']//span)[1]"));
		 element.click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 element= driver.findElement(By.id("a-autoid-0-announce"));
		 element.click();
		 
		 element = driver.findElement(By.linkText("Price: High to Low"));
		 element.click();
		 
		 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 element = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']//span)[4]"));
		 element.click();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 element = driver.findElement(By.id("add-to-cart-button"));
		 element.click();
		 
		 driver.close();
		 System.out.println("Success");
	 
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}

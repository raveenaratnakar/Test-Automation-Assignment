package com.argos.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.argos.test.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDefinition {
	public static WebDriver driver;
	public static WebElement element;
	
	static {
		String path = "/Users/jelly/Documents/Chrome/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
	}


	@Given("^open the URL$")
	public void open_the_URL() throws Throwable {
		driver.get("https://www.argos.co.uk/");
	}
	
	@Given("^click on the shop menu$")
	public void click_on_the_shop_menu() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(Constants.SHOP));
		element.click();
	}
	
	@Then("^click on the technology option$")
	public void click_on_the_technology_option() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			element = driver.findElement(By.xpath(Constants.TECHNOLOGY));
			element.click();
			}catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				element = driver.findElement(By.xpath(Constants.TECHNOLOGY));
				element.click();
			}
	}
	
	@Then("^click on the Laptop option$")
	public void click_on_the_Laptop_option() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		element = driver.findElement(By.xpath(Constants.LAPTOP));
		element.click();
	}
	
	@Then("^click on the Macbook option$")
	public void click_on_the_Macbook_option() throws Throwable {
		element = driver.findElement(By.xpath(Constants.MACBOOK));
		element.click();
	}
	
	@Then("^select the high to low price option from the dropdown$")
	public void select_the_high_to_low_price_option_from_the_dropdown() throws Throwable {
		WebElement e = driver.findElement(By.id(Constants.RELEVANCE)); 
		Select o = new Select(e);
		o.selectByIndex(2);
	}
	
	@Then("^add the first item to the basket$")
	public void add_the_first_item_to_the_basket() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(Constants.ADD_FIRST_ITEM));
		element.click();
	}
	
	@Then("^click on the continue shopping button$")
	public void click_on_the_continue_shopping_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(Constants.CONTINUE_SHOPPING));
		element.click();
	}
	
	@Then("^add the second item to the basket$")
	public void add_the_second_item_to_the_basket() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(Constants.ADD_SECOND_ITEM));
		element.click();
	}
	
	@Then("^click on the navigate to trolley option$")
	public void click_on_the_navigate_to_trolley_option() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.linkText(Constants.TROLLEY));
		element.click();
	}
	
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
	}
}

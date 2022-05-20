package com.GmailAccount;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GmailLogin {
	
	
	
	public static WebDriver driver;

	@Before
	public  void setUp()
		{


			System.out.println("Hello welcome to Webdriver java");

			

			String exePath = "C:\\Users\\harsvardhan\\Desktop\\selenium jar\\chrome\\chromedriver.exe";

			

			System.setProperty("webdriver.chrome.driver", exePath);

			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			
		}
	
	
	@Test
	void login() {
		
		WebElement username = driver.findElement(By.id("identifierId"));

		username.sendKeys("harshavardhankaki117@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("//span[contains(.,'Next')]"));

		next.click();
		
		WebElement password = driver.findElement(By.name("password"));

		password.sendKeys("Harsha@333");
		
		
		WebElement login = driver.findElement(By.xpath("//div[@id='view_container']/div/div/div[2]/div/div/div/form/span/section/div"));

		login.click();
		
	}
	
	@After
	public  void tearDown()
	{

		driver.quit();
	}
}



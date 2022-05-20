package com.GmailAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGmailAccCreation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.out.println("Hello welcome to WebDriver");
		
		String exepath = "C:\\Users\\harsvardhan\\Desktop\\selenium jar\\chrome\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",exepath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2F&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Harsha Vardhan");
		
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Kaki");
		
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Harsha.harman.test");
		
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("Harman0000Password");
		
		Thread.sleep(1000);
		
		WebElement confirm = driver.findElement(By.name("ConfirmPasswd"));
		confirm.sendKeys("Harman0000Password");
		
		Thread.sleep(1000);
		
		WebElement next1 = driver.findElement(By.id("accountDetailsNext"));
		next1.click();
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
		phone.sendKeys("9491500435");
		
		WebElement next2 = driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		next2.click();
		
		//Thread.sleep(3000);
		
		//driver.close();

	}

}

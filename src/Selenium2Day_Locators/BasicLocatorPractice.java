package Selenium2Day_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocatorPractice {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		BasicLocatorPractice launcher = new BasicLocatorPractice();
		//launcher.testNonStatic();
	
		// BasicLocatorPractice.testStatic();
		
		// testStatic();
		
		//BasicLocatorPractice.findByLinkText();

		// findByPartialLinkText();

		//BasicLocatorPractice.findByClassName();

		//findByTag();
		
		//Thread.sleep(500);
		
		testCase2();
		
	}
	
	
	public static void testCase2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement CreateNewAccountBtn = driver.findElement(By.linkText("Create new account"));

		CreateNewAccountBtn.click();
		Thread.sleep(1000);
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Automation");
		
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Automation");
		
		WebElement Email = driver.findElement(By.name("reg_email__"));
		Email.sendKeys("Automation");
		
		WebElement Password = driver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("Automation");
		
		WebElement SignUpBtn = driver.findElement(By.name("websubmit"));
		SignUpBtn.click();
		
	}
	
	
	public static void findByTag() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.facebook.com");
		
		WebElement forgetLink = driver.findElement(By.tagName("h1"));
		
		forgetLink.click();
	}
	
	
	
	
	public static void findByClassName() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.facebook.com");
		
		WebElement forgetLink = driver.findElement(By.className("_8esh"));
		
		forgetLink.click();
	}
	
	
	public static void findByPartialLinkText() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.facebook.com");
		
		WebElement forgetLink = driver.findElement(By.partialLinkText("Forgot "));
		
		forgetLink.click();
	}
	
	
	public static void findByLinkText() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.facebook.com");
		
		WebElement forgetLink = driver.findElement(By.linkText("Forgot password?"));
		
		forgetLink.click();
	}	
	
	

	public static void testStatic() {
		
		System.out.println("STATIC METHOD");
	}
	
	
	public void testNonStatic() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement loginField = driver.findElement(By.id("email"));
		loginField.sendKeys("Automation");
		
  	    WebElement passField = driver.findElement(By.id("pass"));
		passField.sendKeys("Automation");
		
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
	}
}



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Selenium1Day {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			
		//	driver.get("http://crater.primetech-apps.com");

			driver.get("https://amazon.com");
			
			String title = driver.getTitle();
	
			System.out.println(title);
			Thread.sleep(5000);
	
			WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("Coffee Mug");
			
			
			WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
			searchButton.click();
			
	}
	

}

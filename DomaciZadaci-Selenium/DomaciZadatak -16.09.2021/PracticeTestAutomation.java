package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciZadatakPractice {

	public static void main(String[] args) throws Exception {
		
		/*
		Napisati program koji ucitava https://practicetestautomation.com/ stranicu, 
		klikne na "Practice" i klikne na "Test login page", popunjava username i password (student/Password123),
		loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.
		*/
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/ ");
		
		WebElement practice =driver.findElement(By.id("menu-item-20"));
		practice.click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.linkText("Test Login Page"));
		login.click();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		Thread.sleep(1000);
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		Thread.sleep(1000);
		
	    WebElement logout = driver.findElement(By.linkText("Log out"));
	    logout.click();
	    Thread.sleep(1000);
	    
	    driver.close();	
	
	}
}

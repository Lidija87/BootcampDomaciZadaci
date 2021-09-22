package DomaciZadatakHappyPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyPath {

	public String username;
	public String password;
	
	public HappyPath() {
		this.username = username;
		this.password = password;
	}
	
	public void happyPath() {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("tomsmith");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("SuperSecretPassword!");
		
		WebElement login = driver.findElement(By.className("radius"));
		login.click();
		
		
		WebElement provera= driver.findElement(By.id("flash"));
		  String provera1=provera.getText();
		  
		  if (provera1.contains("You logged into a secure area")) {
			  
			  System.out.println("PASS");
			  
		  }
	 }
}

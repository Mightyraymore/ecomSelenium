package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAddressInfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/chadgayken/Documents/software/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		// open up account page to create new account
		driver.findElement(By.id("nav-link-accountList")).click();
		
		// Email input
		driver.findElement(By.id("ap_email")).sendKeys("");
		
		// Password Input
		driver.findElement(By.id("ap_password")).sendKeys("");
		

		// click create your amazon account button
		driver.findElement(By.id("signInSubmit")).click();
				
		// Type search text
		driver.findElement(By.id("twotabsearhtextbox")).sendKeys("Keyboard");
		
		// open the accounts list drop down
		//driver.findElement(By.className("nav-a nav-a-2 nav-truncate")).click();
		driver.findElement(By.xpath("//button[contains(@class='nav-line-2')]")).click();
		
		
				}

}

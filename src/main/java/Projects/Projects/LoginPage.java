package Projects.Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LoginPageFunctionality(String email, String password) throws InterruptedException {
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		
		Email.click();
		Email.sendKeys(email);
		Thread.sleep(2000);
		Password.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login to QTrip']")).click();
		
	}

}

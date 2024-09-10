package Projects.Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registerpage {
	
	WebDriver driver;
	WebDriverWait wait; 
	
	public Registerpage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void RegisterPageFunctionality(String email, String password) throws InterruptedException {
		
	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
	WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
	
	Email.sendKeys(email);
	Thread.sleep(2000);
	Password.sendKeys(password);
	Thread.sleep(2000);
	ConfirmPassword.sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Register Now']")).click();
		
	}
	

}

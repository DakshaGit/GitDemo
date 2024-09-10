package QtripAppTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Projects.Projects.HomePage;
import Projects.Projects.LoginPage;
import Projects.Projects.Registerpage;

public class TestCase2 {
	
	WebDriver driver;
	
	public void TestCase1(String Email, String Password) throws InterruptedException {	
	      
	    HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		Registerpage rp = new Registerpage(driver);
		
		rp.RegisterPageFunctionality(Email,Password);
		Thread.sleep(2000);
		lp.LoginPageFunctionality(Email, Password);
		Thread.sleep(2000);
		hp.VerifyLogoutButton();
		System.out.println(hp.VerifyLogoutButton());
		hp.LogOutButton();
		Thread.sleep(2000);
		hp.VerifyLoginHereButton();
		System.out.println(hp.VerifyLoginHereButton());
	}
	
	public static void main(String[] arg) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
	}

}

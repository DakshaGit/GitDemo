package QtripAppTestCases;

import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Projects.Projects.HomePage;
import Projects.Projects.LoginPage;
import Projects.Projects.Registerpage;

public class TestCase1 {
	
	WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		Registerpage rp = new Registerpage(driver);
		
		driver.get("https://qtripdynamic-qa-frontend.vercel.app/");
		String Email = "testemail"+UUID.randomUUID()+"@gmail.com";
		String Password = "testpassword"+UUID.randomUUID();
		
		hp.RegisterButton();
		Thread.sleep(2000);
		rp.RegisterPageFunctionality(Email,Password);
		Thread.sleep(2000);
		lp.LoginPageFunctionality(Email, Password);
		Thread.sleep(2000);
		hp.VerifyLogoutButton();
		System.out.println(hp.VerifyLogoutButton());
		Thread.sleep(2000);
		hp.GetCityNames();
		
		System.out.print("***********************************************");
		driver.quit();
			
	}
	
}

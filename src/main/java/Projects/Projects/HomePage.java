package Projects.Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void RegisterButton() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	public void LoginButton() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
	
	public boolean VerifyLogoutButton() {
		boolean verify = driver.findElement(By.xpath("//div[text()='Logout']")).isDisplayed();
		return verify;
	}
	
	public void GetCityNames() {
		List<WebElement> Cities = driver.findElements(By.xpath("//div[@class='col-6 col-lg-3 mb-4']//a"));
		int CitiesCount = Cities.size();
		System.out.println(CitiesCount);
		
		for(int i=0; i<CitiesCount;i++)
		{
		String CitiesName = Cities.get(i).getText();
		System.out.println(CitiesName);
		
		}
		
		
		/*for(int j=0; j<CitiesCount;j++)
		{
			String City = Cities.get(j).getText();
			if (City == "BENGALURU");
			{
				Cities.get(j).click();
				System.out.println(City);
				break;
			}
		}*/
			
	}
	
	public void SearchCity() {
		
		Actions a = new Actions(driver);
		WebElement SearchText = driver.findElement(By.id("autocomplete"));
		a.click(SearchText);
		a.sendKeys(SearchText, "beng");
		WebElement CitySuggestion = driver.findElement(By.xpath("//li[contains(text(),'Bengaluru')]"));
		a.click(CitySuggestion);
		
	
	}
	
	public void LogOutButton() {
	
		 driver.findElement(By.xpath("//div[text()='Logout']")).click();
		 
	}
	
	public boolean VerifyLoginHereButton() {
		boolean verify = driver.findElement(By.name("Login Here")).isDisplayed();
		return verify;
	}
	

}

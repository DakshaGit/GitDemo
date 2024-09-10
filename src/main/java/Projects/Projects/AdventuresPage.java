package Projects.Projects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdventuresPage {
	WebDriver driver;

	public AdventuresPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DurationFilter() {
	
	WebElement dd = driver.findElement(By.xpath("//select[@id='duration-select']"));
	Select s1 = new Select(dd);
	s1.selectByVisibleText("2-6 Hours");
	
	}
	
	public void CategoryFilter() {
	
	WebElement cd = driver.findElement(By.xpath("//select[@id='category-select']"));
	Select s2 = new Select(cd);
	s2.selectByVisibleText("Party Spots");
	
	}
	
    public void PrintAdventures() {
		
		List<WebElement> Adventures = driver.findElements(By.xpath("//div[@class='col-6 col-lg-3 mb-4']//a"));
		int AdventuresCount = Adventures.size();
		System.out.println(AdventuresCount);
		
		for(int k=0; k<AdventuresCount; k++)
		{
			String AdventuresName = Adventures.get(k).getText();
			System.out.println(AdventuresName);	
		}
		
	}

}

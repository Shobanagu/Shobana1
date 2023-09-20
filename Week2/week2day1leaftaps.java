package Week2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import.org.openqa.selenium.By.class;
import org.openqa.selenium.support.ui.Select;
public class week2day1leaftaps {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To call driver
		ChromeDriver driver=new ChromeDriver();
		
		// To launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Auto enter Username
		driver.findElement(By.id("username")).sendKeys(("Demosalesmanager"));
		
		//Auto enter Password
		driver.findElement(By.id("password")).sendKeys(("crmsfa"));
		
		//Click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on accounts
		driver.findElement(By.partialLinkText("Accounts")).click();
		
		//CLick on Create Accounts  		
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		//Auto account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Shobana4");
		
		
		//Enter description
		driver.findElement(By.name("description")).sendKeys(("Selenium Automation Tester"));
		
		//Select computer software as industry 
		WebElement select =driver.findElement(By.name("ownershipEnumId"));
	    Select opt =new Select (select);
		opt.selectByVisibleText("S-Corporation");
		
 
		// select Employee as Source using select by visible text 
		driver.findElement(By.xpath("//SELECT[@id='dataSourceId']")).sendKeys("Employee");

		//Select ecommerce site inetrnal campaign as marketingCampaignId using select by  index  option
		WebElement mar =driver.findElement(By.id("marketingCampaignId"));
	    Select opt4 =new Select (mar);
		opt4.selectByIndex(4)  ;
		
		
 
		//select State as Texas using select by value option
		driver.findElement(By.xpath("//SELECT[@name='generalStateProvinceGeoId']")).sendKeys("Texas");

		// CLick on create account 
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify account name is displayed correctly
		
		//Close the other browser
		driver.close();
	}

}



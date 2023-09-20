package Week2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import.org.openqa.selenium.By.class;
import org.openqa.selenium.support.ui.Select;

public class week2day1facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ChromeDriver driver =new ChromeDriver();
		
		
		// To launch URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on create new account
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		

		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SHOBANA");
		 
	
				 
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("GU");
	     
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("shobana.naidu9@gmail.com");
	     driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("shobana.naidu9@gmail.com");

	     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Vascular@123");
	     
	     
	     
	     //driver.findElement(By.xpath("//SELECT[@name='birthday_day']")).sendKeys("09");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     WebElement date =driver.findElement(By.name("birthday_day"));
	     Select OPTIONDATE =new Select (date);
	    OPTIONDATE.selectByValue("9");
	     
	     WebElement Mon =driver.findElement(By.name("birthday_month"));
	     Select OPTIONMOTNH =new Select (Mon);
	     OPTIONMOTNH.selectByVisibleText("Oct");
	     
	     WebElement YEAR =driver.findElement(By.name("birthday_year"));
	     Select OPTIONYEAR =new Select (YEAR);
	     OPTIONYEAR.selectByValue("1990");
	     
	     
	     WebElement radio1=driver.findElement(By.name("sex"));
	     
	     radio1.click();
	     
	     driver.findElement(By.name("websubmit")).click();
	     
		
	}
}



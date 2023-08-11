package Maven_Programs.Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_prog {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("Devyani");
		driver.findElement(By.name("lastName")).sendKeys("Pagare");
		WebElement countrydropdown =driver.findElement(By.name("country"));
		
		// For drop down 
		Select s=new Select(countrydropdown);
		//s.selectByIndex(2);
		//s.selectByVisibleText("AUSTRALIA");
		s.selectByValue("ARGENTINA");
	}

}

package Maven_Programs.Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters_day1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#user-name"));
		  driver.findElement(By.cssSelector("#user-name")).sendKeys("Java");
		 // driver.findElement(By.cssSelector("#user-name")).sendKeys(Keys.ENTER);
		  //System.out.println("Title after search is -- "+driver.getTitle());
		  //driver.navigate().back();
		  //driver.findElement(By.linkText("Images")).click();
		//  System.out.println("Images url is "+driver.getCurrentUrl());
	}

}

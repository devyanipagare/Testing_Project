package Maven_Programs.Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Website_prog {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("gh-ac")).sendKeys("Mobile");
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
	//driver.close();
	driver.quit();
	

	}

}

package Maven_Programs.Selenium_Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> linklists=driver.findElements(By.tagName("a"));
		int s=linklists.size();
		System.out.println("Number of available links are"+s);
		
		for(int i=0;i<s;i++)
		{
			String linkName= linklists.get(i).getText();
			System.out.println(linkName);
			
		}
	}
}

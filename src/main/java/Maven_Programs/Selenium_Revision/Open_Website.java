package Maven_Programs.Selenium_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Website {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	String title= driver.getTitle();
	System.out.println("Title of the page is---"+title);
	}

}

package Maven_Programs.Selenium_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Command_Task1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		int titlelength=title.length();
		System.out.println("Title of the page is--"+title);
		System.out.println("Length of the tile is--"+titlelength);
		String url=driver.getCurrentUrl();
		System.out.println("Open the url"+url);
		driver.navigate().to("https://www.facebook.com/login/");
		String urlfb=driver.getCurrentUrl();
		System.out.println("FB url is--"+urlfb);
		

	}

}

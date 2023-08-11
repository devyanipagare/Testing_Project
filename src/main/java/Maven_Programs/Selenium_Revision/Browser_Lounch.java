package Maven_Programs.Selenium_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Lounch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //open chrome browser
		  //WebDriver driver = new EdgeDriver();
		  //WebDriver driver = new FirefoxDriver();
		  //WebDriver driver = new InternetExplorerDriver();
		  
		  driver.manage().window().maximize(); // to maximize window
		  
		  driver.get("https://www.google.com/");// to open url 
		  String title = driver.getTitle(); // to get title
		  System.out.println("Tile of the page is ---"+title); // print title
		  driver.navigate().back();
		  driver.navigate().forward();
		  driver.navigate().refresh();
		 //river.navigate().to("");

	}

}

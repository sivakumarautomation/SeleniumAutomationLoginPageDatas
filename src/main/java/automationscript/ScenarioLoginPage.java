package automationscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

//package//

public class ScenarioLoginPage { //class//
	
	public static WebDriver odriver;
	
	public static void main(String[] args) { //Main//
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome browser");
			odriver = new ChromeDriver();
		
		}
		
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox browser");
			odriver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")) {
			System.out.println("launch safari browser");
			odriver = new SafariDriver();
		}
		
		else if(browser.equals("IE")) {
			System.out.println("launch internet explorer");
			odriver = new InternetExplorerDriver();
		}
		
				
		else
		{
			System.out.println("pass valid browser");
		}
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.amazon.in/");
		
	}

}

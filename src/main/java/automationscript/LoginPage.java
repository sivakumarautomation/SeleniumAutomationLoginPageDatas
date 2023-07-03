package automationscript; //package//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage { //class//
	
	public static void main(String[] args) { //Main//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//current Url//
		
		String url = odriver.getCurrentUrl();
		System.out.println(url);
		
		//Title//
		
		String title = odriver.getTitle();
		System.out.println(title);
		
		odriver.quit();
		
		
	}

}

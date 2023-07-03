package automationscript; //package//

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTool { //class//
	
	public static void main(String[] args) { //Main//
		
		WebDriverManager.chromedriver().setup();
		
		//class object = new class;//
		
		ChromeDriver odriver = new ChromeDriver();
		
		odriver.get("https://www.apple.com/in/");
		
		//Current Url//
		
		String url = odriver.getCurrentUrl();
		System.out.println(url);

		// Current Title//

		String title = odriver.getTitle();
		System.out.println(title);
		
	}

}

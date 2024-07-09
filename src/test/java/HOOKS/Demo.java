package HOOKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Demo {
	public static WebDriver driver;
@Before
public void launchstatements() {
      ChromeDriver driver = new ChromeDriver ();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
}
	@After
	public void teardown() {
		
	driver.close();
	}
	
	
	
}

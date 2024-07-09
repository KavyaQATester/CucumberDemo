package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefination {
public static  WebDriver driver;

 @Given("openbrowser and enter url")
  public void openbrowser_and_enter_url() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
}
 @When("user enter valid email")
 public void user_enter_valid_email() {
    WebElement usernamefield=driver.findElement(By.id("Email"));
    usernamefield.clear();
    usernamefield.sendKeys("admin@yourstore.com");
 }


@When("user enter valid password")
public void user_enter_valid_password() throws InterruptedException {
    driver.findElement(By.id("Password")).clear();
   driver.findElement(By.id("Password")).sendKeys("admin");
   Thread.sleep(3000);
}

@When("user  click on login button")
public void user_click_on_login_button() {
   driver.findElement(By.xpath("//button[@type='submit']")).click();
}
@Then("it should navigate dashboardpage")
 public void it_should_navigate_dashboardpage() {
    String expected="Dashboard / nopCommerce administration";
    String actual= driver.getTitle();
   Assert.assertEquals(expected, actual);
 }
//}
      
// @When("user enter invalid username")
// public void user_enter_invalid_username() {
	//  WebElement usernamefield= driver.findElement(By.id("username"));
	  // usernamefield.sendKeys("gdegfef");
// }

// @When("user enter invalid password")
 // public void user_enter_invalid_password() {
	//driver.findElement(By.name("password")).sendKeys("Pauhuggts");
// }

 // @Then("it should throw some error message")
// public void it_should_throw_some_error_message() throws InterruptedException {
	  // String expected="invalid username and password";
	  // Thread.sleep(2000);
	  // String actual= driver.findElement(By.id("error")).getText();
	//  Assert.assertEquals(expected, actual);
// }
// @Then("it should throw some error message as invalid username")
// public void it_should_throw_some_error_message_as_invalid_username() throws InterruptedException {
	// String expected="invalid username";
	// Thread.sleep(2000);
	 //  String actual= driver.findElement(By.id("error")).getText();
	//  Assert.assertEquals(expected, actual);

//}                                                                              
//@Then("it should throw error message as invalid password")
//public void it_should_throw_error_message_as_invalid_password() throws InterruptedException {
	//String expected="invalid password";
	 //Thread.sleep(2000);
	  // String actual= driver.findElement(By.id("error")).getText();
	//  Assert.assertEquals(expected, actual);
//}
//@When("username and password kept empty")
//public void username_and_password_kept_empty() {
   
//}

//@Then("it should  throw error message as data required")
//public void it_should_throw_error_message_as_data_required() throws InterruptedException {
	//String expected="data required";
	 //Thread.sleep(2000);
	  // String actual= driver.findElement(By.id("error")).getText();
	//  Assert.assertEquals(expected, actual);
//}        

@When("user enter{string}")
public void userenterusername(String userdata) {
	WebElement usernamefield=driver.findElement(By.id("Email"));
	usernamefield.clear();
	usernamefield.sendKeys(userdata);
}
@When("user entered {string}")
public void   userenteredpassword(String pwd) {
driver.findElement(By.id("password")).clear();
driver.findElement(By.id("password")).sendKeys(pwd);
}
@When("user click on login Btn")
public void userclickonloginBtn() {
	driver.findElement(By.tagName("submit")).click();
}
@Then("it should display the result")
public void itshouldbedisplaytheresult() {
	System.out.println("executed");
}
@Then ("close the browser")
public void closethebrowser() {
	driver.close();
}


}




	
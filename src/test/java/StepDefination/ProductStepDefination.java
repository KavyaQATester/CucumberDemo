package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ProductStepDefination {
	 WebDriver driver=LoginStepDefination.driver;

//	@When("user click on cataloglink")
//	public void user_click_on_cataloglink() {
//	    driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
//	}
	@When("user click on productlink")
	public void user_click_on_productlink() throws InterruptedException {
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
	}

	@Then("it should navigate products page")
	public void it_should_navigate_products_page() {
	   String expected="Products / nopCommerce administration";
	   String actual = driver.getTitle();
	   Assert.assertEquals(expected, actual);
	}

	@When("user enter valid product name")
	public void user_enter_valid_product_name() {
	   driver.findElement(By.id("SearchProductName")).sendKeys("Windows 8 Pro");
	}
	//  @When("user click on search Btn")
	//  public void user_click_on_search_btn() throws InterruptedException {
	   //  driver.findElement(By.id("search-products")).click();
	    // Thread.sleep(2000);
	//}

	@Then("it should display product details")
	public void it_should_display_product_details() {
	    String expected= "Windows 8 Pro";
	    String actual = driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
	    Assert.assertEquals(expected, actual);
	}
	@When("user enter invalid product name")
	public void user_enter_invalid_product_name() {
	   driver.findElement(By.id("SearchProductName")).sendKeys("ygdgfggfug");
	}
	
}

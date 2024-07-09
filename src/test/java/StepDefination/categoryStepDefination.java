package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class categoryStepDefination {
	 WebDriver driver=LoginStepDefination.driver;

	@When("user click on cataloglink")
	public void user_click_on_cataloglink() {
	    driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
	}
	@When("user click on categorieslink")
	public void user_click_on_catagorylink() throws InterruptedException {
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@href=\"/Admin/Category/List\"]")).click();
	}

	@Then("it should navigate category name page")
	public void it_should_navigate_catalogname_page() {
	   String expected="Categories / nopCommerce administration";
	   String actual = driver.getTitle();
	   Assert.assertEquals(expected, actual);
	}

	@When("user enter valid category name")
	public void user_enter_valid_catalog_name() {
	   driver.findElement(By.id("SearchCategoryName")).sendKeys("Jewelry");
	}
	  @When("user click on search Btn")
 	public void user_click_on_search_btn() throws InterruptedException {
	    driver.findElement(By.id("search-categories")).click();
	    Thread.sleep(2000);
	}

	@Then("it should display category page details")
	public void it_should_display_catalogpage_details() {
	    String expected= "Jewelry";
	    String actual = driver.findElement(By.xpath("//table/tbody/tr/td[2]")).getText();
	    Assert.assertEquals(expected, actual);
	}
	
	
}

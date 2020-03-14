package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjectModel.homePage;
import utilities.Driver;
import utilities.readProperties;

public class addToCart {
    WebDriver driver = Driver.getDriver();
    homePage homePage = new homePage();

    @Given("^Navigate to website$")
    public void navigate_to_website() {
        driver.get( readProperties.getData( "URL" ) );
        driver.manage().window().maximize();

    }

    @And("^Search for \"([^\"]*)\"$")
    public void search_for(String arg1) {
        homePage.writeInSeachButton( arg1 );
    }

    @And("^Click on search button$")
    public void click_on_search_button() {
        homePage.clickOnButtonSearch();
    }

    @And("^Click on any item$")
    public void click_on_any_item() {

    }

    @And("^Fill all the required fields$")
    public void fill_all_the_required_fields() {

    }

    @And("^Click on Add to cart button$")
    public void click_on_Add_to_cart_button() {

    }

    @Then("^Verify I am in the cart page$")
    public void verify_I_am_in_the_cart_page() {

    }


    @And("^Verify I'm in the cart$")
    public void verifyIMInTheCart() {
    }
}
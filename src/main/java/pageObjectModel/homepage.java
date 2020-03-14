package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

  class homePage extends AbstractClass{

    WebDriver driver = Driver.getDriver();

    public homePage(){

        PageFactory.initElements( driver , this );
    }

    @FindBy(xpath = "//input[@data-id='search-query']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@value='Search']")
    private WebElement buttonSearch;

    public void writeInSeachButton(String search){
        sendKeysFunctionality( searchInput ,  search);
    }

    public void clickOnButtonSearch(){
        clickFunctionality( buttonSearch );
    }

}
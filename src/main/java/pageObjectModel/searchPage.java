package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class searchPage extends AbstractClass{

    WebDriver driver = Driver.getDriver();

    public searchPage(){

        PageFactory.initElements( driver , this );

    }

    @FindAll({
            @FindBy(xpath = "//img[contains(@class,'width-full wt-height-full display-block position-absolute ')]")
    })
    private List<WebElement> products;

    public void clickAnyProducts(){
        clickRandomNum( products );
        switchWindow();
    }

}

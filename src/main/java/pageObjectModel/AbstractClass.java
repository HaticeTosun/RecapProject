package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class AbstractClass {

    //   create a reusable method for click functionality
    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait( driver , 10 );

    public void clickFunctionality(WebElement clickButton){

        wait.until( ExpectedConditions.elementToBeClickable( clickButton ) );
        clickButton.click();

    }

    //   create a reusable method for sendkeys functionality
    public void sendKeysFunctionality(WebElement sendKeysButton , String value){

        wait.until( ExpectedConditions.visibilityOf( sendKeysButton ) );
        sendKeysButton.sendKeys( value );
    }

    public int randomNum(int max){

        Random rnd = new Random(  );

        int myRandom = rnd.nextInt(max);

        return myRandom;

    }

    public void clickRandomNum(List<WebElement> listOfElements){

        int rnd = randomNum( listOfElements.size() );

        clickFunctionality( listOfElements.get( rnd ) );

    }

    public void switchWindow(){

        Set<String> windows=  driver.getWindowHandles();

        for(String myWin:windows){
            driver.switchTo().window( myWin );
            System.out.println(driver.getCurrentUrl());

        }

    }


}

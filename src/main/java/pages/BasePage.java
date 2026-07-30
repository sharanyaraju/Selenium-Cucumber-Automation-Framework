package pages;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait  wait;

    public BasePage(){
        this.driver=DriverFactory.getDriver();
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    protected void click(WebElement element){
        try {

            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();

        }
        catch(Exception e){

            throw new RuntimeException("Unable to click element : " + element);

        }
    }

    protected  void type(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

        return element.getText();
    }

    protected boolean isDisplayed(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

}

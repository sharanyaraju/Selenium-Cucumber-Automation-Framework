package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    public ProductsPage(){
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "title")
    private WebElement pageTitle;



    public boolean isProductsPageDisplayed(){

        return isDisplayed(pageTitle);

    }

}
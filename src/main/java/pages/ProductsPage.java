package pages;

import org.openqa.selenium.By;
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

    @FindBy(className = "shopping_cart_badge")
    private WebElement cartBadge;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartIcon;


    public boolean isProductsPageDisplayed() {

        return getText(pageTitle)
                .equals("Products");

    }

    private WebElement addToCartButton(String productName) {
        return driver.findElement(By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button"));

    }

    public ProductsPage addProduct(String product){
        click(addToCartButton(product));
        return this;
    }

}
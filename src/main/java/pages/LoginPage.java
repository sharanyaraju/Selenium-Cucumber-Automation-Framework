
package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement txtUsername;

    @FindBy(id = "password")
    private WebElement txtPassword;
    @FindBy(id = "login-button")
    private WebElement btnLogin;
    @FindBy(css = ".error-message-container")
    private WebElement lblError;

    public void enterUsername(String username) {
        type(txtUsername, username);
    }

    public void enterPassword(String password) {

        type(txtPassword, password);

    }

    public ProductsPage clickLogin() {

        click(btnLogin);
        return new ProductsPage();

    }

    public ProductsPage login(String username, String password) {

        enterUsername(username);

        enterPassword(password);

        clickLogin();
        return new ProductsPage();

    }
    public String getErrorMessage() {
        return getText(lblError);
    }
}
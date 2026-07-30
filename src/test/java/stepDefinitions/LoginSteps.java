package stepDefinitions;


import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.JsonReader;


public class LoginSteps {


    LoginPage loginPage;
    ProductsPage productsPage;

    String username =
            JsonReader.getValue(
                    "validUser",
                    "username"
            );


    String password =
            JsonReader.getValue(
                    "validUser",
                    "password"
            );

    public LoginSteps() throws Exception {
    }


    @Given("user launches the SauceDemo application")
    public void launchApplication(){

        loginPage = new LoginPage();

    }



    @When("user enters valid username and password")
    public void enterCredentials(){

        loginPage.enterUsername(username);

        loginPage.enterPassword(password);

    }



    @When("clicks on login button")
    public void clickLogin(){

        productsPage = loginPage.clickLogin();

    }



    @Then("user should be navigated to Products page")
    public void verifyProductsPage(){

        Assert.assertTrue(
                productsPage.isProductsPageDisplayed()
        );

    }

    @Then("Add {string} to the cart")
    public void add_to_the_cart(String product) {

    }

}
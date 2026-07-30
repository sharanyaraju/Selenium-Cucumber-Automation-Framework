package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.ConfigReader;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();

    public static void initializeDriver() {
        ConfigReader.initializeProperties();
        String browser = ConfigReader.getProperty("browser");
        if(browser == null || browser.isEmpty()) {
            browser = "chrome";
        }
        WebDriver webDriver;
        switch (browser){
            case "chrome":
                webDriver = new ChromeDriver();
                break;

            case "firefox":
                webDriver = new FirefoxDriver();
                break;

            case "edge":
                webDriver=new EdgeDriver();
                break;

            default:
                webDriver = new ChromeDriver();


        }

        webDriver.manage().window().maximize();
        webDriver.get(
                ConfigReader.getProperty("url")
        );

        driver.set(webDriver);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.get().quit();
            driver.remove();
        }
    }

}
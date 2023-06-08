package pages;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverPage {
    protected WebDriver driver;

    public WebDriverPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }
}
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtRegNumber")
    private WebElement licensePlateInput;

    @FindBy(id = "btnValuation")
    private WebElement startValuationButton;

    //methods to interact with elements
    public void enterLicensePlateNumber(String licensePlateNumber) {
        licensePlateInput.sendKeys(licensePlateNumber);
    }

    public void startValuation() {
        startValuationButton.click();
    }
}
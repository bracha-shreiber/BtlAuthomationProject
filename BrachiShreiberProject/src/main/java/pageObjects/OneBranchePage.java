package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneBranchePage extends BtlBasePage{
    public OneBranchePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ("//*[@id=\"SnifimTabs\"]/div[1]/ul/li[1]/div/div[1]/h3/a"))
    WebElement branch;
    @FindBy(xpath = "//label[contains(text(),'כתובת')]")
    WebElement address;

    @FindBy(xpath = "//label[contains(text(),'קבלת קהל')]")
    WebElement reception;

    @FindBy(xpath = "//label[contains(text(),'מענה טלפוני')]")
    WebElement telephone_answering;

    public void clickBranch()
    {
        branch.click();
    }
    public boolean hasAddress() {
        return  address.isDisplayed();
    }

    public boolean hasReception() {
        return reception.isDisplayed();
    }

    public boolean hasPhoneService() {
        return telephone_answering.isDisplayed();
    }
}

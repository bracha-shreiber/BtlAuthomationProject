package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchesPage extends BtlBasePage{
    @FindBy(xpath = "//div[@class='opener-bg ']//h1")
    WebElement title;
    public BranchesPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle()
    {
        return title.getText();
    }

}

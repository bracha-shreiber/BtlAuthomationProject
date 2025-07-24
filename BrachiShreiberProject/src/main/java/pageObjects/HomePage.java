package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BtlBasePage{

    @FindBy(id="TopQuestions")
    WebElement searchField;

    @FindBy(id="ctl00_SiteHeader_reserve_btnSearch")
    WebElement searchIcon;

    @FindBy(id="ctl00_Topmneu_BranchesHyperLink")
    WebElement branchesButton;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void search(){
       searchField.sendKeys("חישוב סכום דמי לידה ליום");
       searchIcon.click();
    }

    public BranchesPage getBranchesPage(){
        branchesButton.click();
        return new BranchesPage(super.driver);

    }


}

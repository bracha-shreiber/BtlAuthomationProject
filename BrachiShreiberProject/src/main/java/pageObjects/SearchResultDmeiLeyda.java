package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultDmeiLeyda extends BtlBasePage{

    @FindBy(xpath = ("//*[@id=\"results\"]/h2"))
    WebElement title;


    public SearchResultDmeiLeyda(WebDriver driver) {
        super(driver);

    }
    public String getTitle()
    {
        return title.getText();
    }


}

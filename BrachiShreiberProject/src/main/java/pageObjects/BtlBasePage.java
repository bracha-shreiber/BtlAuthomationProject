package pageObjects;

import enums.TopMenuEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BtlBasePage extends BasePage {

    public BtlBasePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(TopMenuEnum mainNavigate){

        driver.findElement(By.linkText(mainNavigate.getTopMenu())).click();
    }

    public void navigate(String subMenu){
        driver.findElement(By.linkText(subMenu)).click();
    }


}

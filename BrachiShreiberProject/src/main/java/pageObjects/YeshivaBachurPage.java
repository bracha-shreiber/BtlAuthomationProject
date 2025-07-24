package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class YeshivaBachurPage extends BtlBasePage{
    public YeshivaBachurPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="ctl00_Topmneu_InsuranceHyperLink")
    WebElement dmeiBituach;

    @FindBy(xpath = "//li/a[contains(text(),'דמי ביטוח לאומי')]")
    WebElement dmeiBituachLeumi;

    @FindBy(id = "lbl_title")
    WebElement title;

    @FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[2]/span/div[2]/p[3]/a")
    WebElement dmeiBituachCalculator;

    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/h1"))
    WebElement title2;

   @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_employeType_2_lbl\"]")
    WebElement yeshivaStudentCircle;

    @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_DynDatePicker_BirthDate_Date\"]")
    WebElement birthDateInput;

    @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_Gender_0_lbl\"]")
    WebElement maleCircle;

    @FindBy(id="header")
    WebElement header;

    @FindBy(className = "btnNext")
    WebElement next;

    @FindBy(id="ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_GetNechut_1")
    WebElement noGetDisabilityPension;  //קצבת נכות

    @FindBy(xpath = "//ul[@class='CalcResult']/li[last()]/strong")
    WebElement totalInsuranceAmount;

    public void clickOnDmeiBituach() {
        dmeiBituach.click();
    }

    public void clickOnDmeiBituachLeumi() {
        dmeiBituachLeumi.click();
    }

    public String getTitle(){
        return title.getText();
    }

    public void clickOndmeiBituachCalculator() {
        dmeiBituachCalculator.click();
    }

    public String getTitle2(){
        return title2.getText();
    }

    public void clickYeshivaStudentCircle()
    {
        yeshivaStudentCircle.click();
    }

    public void clickMaleCircle()
    {
        maleCircle.click();
    }

    public static LocalDate generateRandomValidDate() {
        LocalDate today = LocalDate.now();

        // טווחי קצה
        LocalDate maxDate = today.minusYears(18).minusDays(1); // הכי מאוחר שמותר
        LocalDate minDate = today.minusYears(70);              // הכי מוקדם שמותר

        // סך כל הימים בין המינימום למקסימום
        long daysBetween = ChronoUnit.DAYS.between(minDate, maxDate);

        // מספר אקראי של ימים להוסיף למינימום
        long randomDays = new Random().nextInt((int) daysBetween + 1);

        return minDate.plusDays(randomDays);
    }

    public void putDateToInput(){
        LocalDate date = generateRandomValidDate();
        String dateStr = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        birthDateInput.clear(); // אם צריך לנקות לפני
        birthDateInput.sendKeys(dateStr);
    }

    public String comeToNextStep()
    {
        return header.getText();
    }

    public void clickOnNextButton()
    {
        next.click();
    }

    public void clickOnNoGetDisabilityPension()
    {
        noGetDisabilityPension.click();
    }

    public String getTotalInsuranceAmount() {
        return totalInsuranceAmount.getText();
    }

}

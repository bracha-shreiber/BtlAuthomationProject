import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.YeshivaBachurPage;

public class YeshivaBachurTest extends BaseTest{

    @Test
    @Description("בדיקה שהניווט לעמוד דמי ביטוח לאומי מצליח, כולל פתיחת מחשבון ובדיקת צעדים")
    public void testNavigateToDmeiBituachCalculator() throws InterruptedException {
        YeshivaBachurPage page = new YeshivaBachurPage(driver);
        page.clickOnDmeiBituach();
        page.clickOnDmeiBituachLeumi();
        Assertions.assertTrue(page.getTitle().contains("דמי ביטוח לאומי"));
        page.clickOndmeiBituachCalculator();
        Assertions.assertEquals("חישוב דמי ביטוח עבור עצמאי, תלמיד, שוהה בחוץ לארץ ומי שלא עובד" ,page.getTitle2(),"t2");
        page.clickYeshivaStudentCircle();
        page.clickMaleCircle();
        page.putDateToInput();
        page.clickOnNextButton();
        Thread.sleep(4000);
        Assertions.assertTrue(page.comeToNextStep().contains("צעד שני"),"צעד שני");
        page.clickOnNoGetDisabilityPension();
        page.clickOnNextButton();
        Thread.sleep(3000);
        Assertions.assertTrue(page.comeToNextStep().contains("סיום"));
        Assertions.assertTrue(page.getTotalInsuranceAmount().contains("163"));
    }




}

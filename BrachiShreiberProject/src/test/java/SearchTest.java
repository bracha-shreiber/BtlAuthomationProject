import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.BranchesPage;
import pageObjects.HomePage;
import pageObjects.OneBranchePage;
import pageObjects.SearchResultDmeiLeyda;

public class SearchTest extends BaseTest{


    @Test
    @Description("בודק שתוצאת החיפוש עבור חישוב סכום דמי לידה ליום מופיעה")
    public void insertText() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.search();
        Thread.sleep(5000);
        SearchResultDmeiLeyda searchResult = new SearchResultDmeiLeyda(driver);
        Assertions.assertEquals("תוצאות חיפוש עבור חישוב סכום דמי לידה ליום" , searchResult.getTitle(),"תוצאות חיפוש");
    }

    @Test
    @Description("בדיקה שעמוד סניפים וערוצי שירות נטען, בודק שקיימת כתובת, קבלת קהל, ומענה טלפוני בעמוד סניף")
    public void checkBranchesPageLoaded()
    {
        HomePage homePage = new HomePage(driver);
        BranchesPage branchesPage = homePage.getBranchesPage();
        Assertions.assertEquals("סניפים וערוצי שירות", branchesPage.getTitle());
        OneBranchePage oneBranchePage = new OneBranchePage(driver);
        oneBranchePage.clickBranch();
        Assertions.assertTrue(oneBranchePage.hasAddress());
        Assertions.assertTrue(oneBranchePage.hasPhoneService());
        Assertions.assertTrue(oneBranchePage.hasReception());
    }












}

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static ExtentReports extent;
    protected static ExtentTest test;
    protected static ExtentSparkReporter reporter;

    protected WebDriver driver;
    @BeforeEach
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://www.btl.gov.il/");
    }

    @AfterEach
    public void closeDriver() {
        this.driver.quit();
    }



}

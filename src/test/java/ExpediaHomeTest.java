import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ExpediaHomeTest
{
     WebDriver driver;
    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\AutomationLearning\\Selenium\\drivers\\chromedriver_win32_1\\chromedriver.exe");
    }
    @Test
    public void testOpenBroswr() {
        driver = new ChromeDriver();
        driver.get("https://www.expedia.ca/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }




    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }}














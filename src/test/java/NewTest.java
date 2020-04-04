

import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.AfterSuite;
        import org.testng.annotations.BeforeSuite;
        import org.testng.annotations.Test;

        import java.util.concurrent.TimeUnit;

public class NewTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\AutomationLearning\\Selenium\\drivers\\chromedriver_win32_1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ca.hotels.com");
    }

    @Test
    public void testCase1() throws InterruptedException {
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='qf-0q-destination']"));
        //searchInput.submit();

        searchInput.sendKeys("Montreal", Keys.SPACE ,"Texas");
       searchInput.sendKeys(Keys.ESCAPE);

        Thread.sleep(2000);
        searchInput.clear();  // when you testing, before writing make a call to clear


        System.out.println(searchInput.getTagName());
        System.out.println(searchInput.getAttribute("class"));

        WebElement search = driver.findElement(By.className("cta-strong"));


        ((JavascriptExecutor) driver).executeScript("$('.cta-strong').css('display','none')");

        Thread.sleep(2000);
        //search.click();

        System.out.println(search.getText());

        if(search.isEnabled()) {
            System.out.println("Enabled We can click");
            search.click();
        }else {
            System.out.println("Button is disabled");
        }

        if(search.isDisplayed()) {
            System.out.println("IS ON SCREEN ");
        }else {
            System.out.println("ITS HIDDEN");
        }



        WebElement link = driver.findElement(By.id("hdr-gift-card"));
        //driver.findElement(By.xpath("//form[@class='cont-bd']")).submit();


    }


    @AfterSuite
    public void tearDown() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
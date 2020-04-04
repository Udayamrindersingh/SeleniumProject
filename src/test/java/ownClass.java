

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ownClass {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\AutomationLearning\\Selenium\\drivers\\chromedriver_win32_1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void testCase1() throws InterruptedException {
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        //searchInput.submit();

        //searchInput.sendKeys("Montreal", Keys.SPACE ,"Texas");
        WebElement searchInput2= driver.findElement(By.xpath("//*[@id=\"pass\"]"));;

        searchInput.sendKeys("udayamrindersingh@gmail.com");

        searchInput2.sendKeys("rifle315");
        WebElement searchInput3= driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));;
    searchInput3.click();

        WebElement navigationclick = driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]"));;
        navigationclick.click();

        WebElement logout = driver.findElement(By.xpath("//*[@id=\"//*[@id=\"js_13\"]/div/div/ul/li[13]\"]"));;
        logout.click();


//        Thread.sleep(4000);
  //      searchInput.clear();  // when you testing, before writing make a call to clear






       /* System.out.println(searchInput.getTagName());
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
*/

    }


    @AfterSuite
    public void tearDown() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}



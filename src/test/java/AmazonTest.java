import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.GoodsPage;
import pages.MainPage;

public class AmazonTest {

    WebDriver driver;
    MainPage mainPage;
    GoodsPage goodsPage;
    BasketPage basketPage;


    @BeforeTest
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.ca/gp/aw/c?ref_=navm_hdr_cart");
        mainPage = new MainPage(driver);
        goodsPage = new GoodsPage(driver);
        basketPage = new BasketPage(driver);


    }

    @Test
       public void AmazonTest()throws InterruptedException {

        mainPage.search();
        goodsPage.enter();
        basketPage.check();
//
//        WebElement input1 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
//        input1.sendKeys("Bicycle");
//       input1.click();
//
//        WebElement submitButtom = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
//        submitButtom.click();
//
//        WebElement input2 = driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]"));
//        input2.click();
//
//        WebElement submitButtom1 = driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
//        submitButtom1.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.ca/gp/cart/view.html?ref_=nav_cart");

    }
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}




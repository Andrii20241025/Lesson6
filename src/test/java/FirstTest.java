import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");

    }


    @Test
    public void myTest(){
        WebElement input1 = driver.findElement(By.xpath("//input[@id='firstname']"));
        input1.sendKeys("qkjnncmjwncnwnlmlw");

        WebElement input2 = driver.findElement(By.id("surname"));
        input2.sendKeys("giwcdwndclknw");

        WebElement input3 = driver.findElement(By.id("age"));
        input3.sendKeys("27");

        WebElement select = driver.findElement(By.id("country"));
        select.sendKeys("Canada");

        WebElement submitButtom = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        submitButtom.click();

//        WebElement answer = driver.findElement(By.xpath("//span"));
//
//        Assert.assertEquals(answer.getText(), "7");



    }
    @AfterTest
    public void closedDriver(){
        driver.quit();
    }
}

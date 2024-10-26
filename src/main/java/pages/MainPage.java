package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

        private WebDriver driver;

        public MainPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
        WebElement input;

        @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
        WebElement submitButtom;


        public void search(){
            input.sendKeys("Bicycle");
            input.click();
            submitButtom.click();
        }
    }

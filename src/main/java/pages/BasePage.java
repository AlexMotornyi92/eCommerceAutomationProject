package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void click(WebElement element){
        element.click();
    }

    public void sendKeys (WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public void waitForElementToBeVisible (By locator, int timeoutInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSec));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getText (WebElement element){
        return element.getText();
    }

    public boolean isElementVisible (WebElement element){
        try {
            return element.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }
}

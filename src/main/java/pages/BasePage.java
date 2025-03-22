package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        WebElement element = findElement(locator);
        element.click();
    }

    public void sendKeys (By locator, String text){
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public void waitForElementToBeVisible (By locator, int timeoutInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSec));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getText (By locator){
        WebElement element = findElement(locator);
        return element.getText();
    }

    public boolean isElementVisible (By locator){
        try {
            WebElement element = findElement(locator);
            return element.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsButton;

    public HomePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
}

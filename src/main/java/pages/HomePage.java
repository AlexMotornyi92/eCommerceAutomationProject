package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[text()='Products']")
    private WebElement productsButton;
    @FindBy(xpath = "//a[@href='/']/img[@alt='Website for automation practice']")
    private WebElement siteLogo;
    @FindBy(xpath = "//a[contains(text(), 'Cart')]")
    private WebElement cartButton;
    @FindBy(xpath = "//a[contains(text(), 'Signup / Login')]")
    private WebElement signupLoginButton;
    @FindBy(xpath = "//a[contains(text(), 'Contact us')]")
    private WebElement contactUsButton;

    public HomePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickProductsButton() {
        productsButton.click();
    }
    public void clickSiteLogo() {
        siteLogo.click();
    }
    public void clickCartButton() {
        cartButton.click();
    }
    public void clickSignupLoginButton() {
        signupLoginButton.click();
    }
    public void sfsdf(){}
}

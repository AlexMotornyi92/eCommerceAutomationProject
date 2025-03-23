package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage{

    @FindBy(xpath = "//input[@data-qa='name']")
    private WebElement nameField;
    @FindBy(xpath = "//input[@data-qa='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@data-qa='subject']")
    private WebElement subjectField;
    @FindBy(xpath = "//input[@data-qa='message']")
    private WebElement messageField;
    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement chooseFileButton;

    public ContactsPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ContactsPage enterName (String name){
        sendKeys(nameField, name);
        return this;
    }



}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    public ProductsPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);

    }
}

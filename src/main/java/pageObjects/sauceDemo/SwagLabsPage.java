package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsPage {

    @FindBy(className = "app_logo")
    public WebElement headerOfPage;
}

package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserPage {

    @FindBy(xpath = "//button[@class='css-1ed0qk5-button']")
    public WebElement btn_DeleteUser;
    @FindBy(css = "button[aria-label='Confirm Modal Danger Button']")
    public WebElement btn_confirmDeletion;
}

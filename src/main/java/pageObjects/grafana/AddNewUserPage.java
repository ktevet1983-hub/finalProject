package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPage {

    @FindBy(id = "name-input")
    public WebElement txt_Name;
    @FindBy(id = "email-input")
    public WebElement txt_Email;
    @FindBy(id = "username-input")
    public WebElement txt_Username;
    @FindBy(id = "password-input")
    public WebElement txt_Password;
    @FindBy(css = "button[type='submit']")
    public WebElement btn_submit;
}

package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(name = "user")
    public WebElement txt_userName;
    @FindBy(id = "current-password")
    public WebElement txt_password;
    @FindBy(xpath = "//button[@class='css-8csoim-button']")
    public WebElement btn_login;
    @FindBy(xpath = "//button[@class='css-oq8fy1-button']")
    public WebElement btn_skip;

    public void submitLogin(String user,String pass){
        txt_userName.sendKeys(user);
        txt_password.sendKeys(pass);
        btn_login.click();
        btn_skip.click();
    }
}

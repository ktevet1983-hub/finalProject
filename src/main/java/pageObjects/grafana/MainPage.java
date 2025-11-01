package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//div[@class='css-wm6ni6']/h1")
    public WebElement head_title;


}

package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class UsersPage {

    @FindBy(xpath = "//table[@class='filter-table form-inline filter-table--hover']/tbody/tr")
    public List<WebElement> rows;
    @FindBy(css = "a[class='css-z53gi5-button']")
    public WebElement btn_NewUser;
    @FindBy(css = "input[class='css-1mlczho-input-input']")
    public WebElement txt_search;

}

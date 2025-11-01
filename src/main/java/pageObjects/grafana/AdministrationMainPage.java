package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AdministrationMainPage {

    @FindBy(xpath = "//section[@class='css-1la81f8']/div")
    public List<WebElement> AdministrationMainPageList;
}

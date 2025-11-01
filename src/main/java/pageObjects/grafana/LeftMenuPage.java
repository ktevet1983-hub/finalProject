package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftMenuPage {
    @FindBy(xpath = "//div[@class='css-1opalb8']/button")
    public WebElement ToggleMenu;
    @FindBy(xpath = "//div[text()='Home']")
    public WebElement homeMenu;
    @FindBy(xpath = "//div[text()='Starred']")
    public WebElement starredLeftMenu;
    @FindBy(xpath = "//div[text()='Dashboards']")
    public WebElement dashboardsLeftMenu;
    @FindBy(xpath = "//div[text()='Explore']")
    public WebElement exploreLeftMenu;
    @FindBy(xpath = "//div[text()='Alerting']")
    public WebElement alertingLeftMenu;
    @FindBy(xpath = "//div[text()='Connections']")
    public WebElement connectionsLeftMenu;
    @FindBy(xpath = "//div[text()='Administration']")
    public WebElement administrationLeftMenu;


}

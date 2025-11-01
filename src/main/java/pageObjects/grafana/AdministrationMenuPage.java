package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrationMenuPage {
    @FindBy(xpath = "(//a[text()='Data sources'])[1]")
    public WebElement dataSourcesAdmin;
    @FindBy(xpath = "(//a[text()='Plugins'])[1]")
    public WebElement plugInsAdmin;
    @FindBy(xpath = "(//a[text()='Users'])[1]")
    public WebElement usersAdmin;
    @FindBy(xpath = "(//a[text()='Teams'])[1]")
    public WebElement teamsAdmin;
    @FindBy(xpath = "(//a[text()='Service accounts'])[1]")
    public WebElement serviceAccountsAdmin;
    @FindBy(xpath = "(//a[text()='Default preferences'])[1]")
    public WebElement defaultPreferencesAdmin;
    @FindBy(xpath = "(//a[text()='Settings'])[1]")
    public WebElement settingsAdmin;
    @FindBy(xpath = "(//a[text()='Organizations'])[1]")
    public WebElement organizationsAdmin;
    @FindBy(xpath = "(//a[text()='Stats and license'])[1]")
    public WebElement statsAndLicenseAdmin;
}

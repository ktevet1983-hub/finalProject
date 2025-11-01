package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions actions;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static Region region;

    // Page Objects grafana
    protected static pageObjects.grafana.LoginPage grafanalogin;
    protected static pageObjects.grafana.MainPage grafanaMain;
    protected static pageObjects.grafana.LeftMenuPage grafanaLeftMenuPage;
    protected static pageObjects.grafana.AdministrationMenuPage grafanaAdministrationMenuPage;
    protected static pageObjects.grafana.UsersPage grafanaUsersPage;
    protected static pageObjects.grafana.AddNewUserPage grafanaAddNewUserPage;
    protected static pageObjects.grafana.EditUserPage grafanaEditUserPage;
    protected static pageObjects.grafana.AdministrationMainPage grafanaAdministrationMainPage;

    // Page Objects sauceDemo
    protected static pageObjects.sauceDemo.MainPage sauceDemoMainPage;
    protected static pageObjects.sauceDemo.SwagLabsPage sauceDemoSwagLabsPage;




}

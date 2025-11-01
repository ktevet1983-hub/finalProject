package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {
    public static void initGrafana() {
        grafanalogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        grafanaLeftMenuPage = PageFactory.initElements(driver, pageObjects.grafana.LeftMenuPage.class);
        grafanaAdministrationMenuPage = PageFactory.initElements(driver, pageObjects.grafana.AdministrationMenuPage.class);
        grafanaUsersPage = PageFactory.initElements(driver, pageObjects.grafana.UsersPage.class);
        grafanaAddNewUserPage = PageFactory.initElements(driver, pageObjects.grafana.AddNewUserPage.class);
        grafanaEditUserPage = PageFactory.initElements(driver, pageObjects.grafana.EditUserPage.class);
        grafanaAdministrationMainPage = PageFactory.initElements(driver, pageObjects.grafana.AdministrationMainPage.class);
    }

    public static void initsauceDemo() {
        sauceDemoMainPage = PageFactory.initElements(driver,pageObjects.sauceDemo.MainPage.class);
        sauceDemoSwagLabsPage = PageFactory.initElements(driver,pageObjects.sauceDemo.SwagLabsPage.class);


    }


}

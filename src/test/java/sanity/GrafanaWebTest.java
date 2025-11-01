package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verification;
import jdk.jfr.Description;
import org.sikuli.script.FindFailed;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import work.flows.WebFlows;

import java.util.concurrent.TimeUnit;

@Listeners(utilities.Listeners.class)
public class GrafanaWebTest extends CommonOps {

    @Test(description = "Test 01 verify header")
    @Description("This test is verify header")
    public void test01_verifyHeader() {
        Verification.verifyEquals(grafanaMain.head_title, "Welcome to Grafana");
    }

    @Test(description = "Test 02 verify default user")
    @Description("This test is verify default user")
    public void test02_verifyDefaultUser() {
        UIActions.click(grafanaLeftMenuPage.ToggleMenu);
        UIActions.click(grafanaLeftMenuPage.administrationLeftMenu);
        UIActions.click(grafanaAdministrationMenuPage.usersAdmin);
        //Uninterruptibles.sleepUninterruptibly(2000, TimeUnit.MILLISECONDS);
        Verification.verifyLists(grafanaUsersPage.rows, 1);
    }

    @Test(description = "Test 03 verify add new user")
    @Description("This test is verify add new user")
    public void test03_verifyAddNewUser() {
        UIActions.click(grafanaLeftMenuPage.ToggleMenu);
        UIActions.click(grafanaLeftMenuPage.administrationLeftMenu);
        UIActions.click(grafanaAdministrationMenuPage.usersAdmin);
        WebFlows.addingNewUsers("Kfi", "kteve3@gmail.com", "kfi", "1235");
        UIActions.click(grafanaAdministrationMenuPage.usersAdmin);
        Verification.verifyLists(grafanaUsersPage.rows, 2);

    }


    @Test(description = "Test 04 verify deletion user")
    @Description("This test is verify deletion user")
    public void test04_verifyDeletionUser() {
        UIActions.click(grafanaLeftMenuPage.ToggleMenu);
        UIActions.click(grafanaLeftMenuPage.administrationLeftMenu);
        UIActions.click(grafanaAdministrationMenuPage.usersAdmin);
        WebFlows.deleteLastUser();
        Verification.verifyLists(grafanaUsersPage.rows, 1);


    }
    @Test(description = "Test 05 verify tabs on administration main page")
    @Description("This test is verify tabs on administration main page")
    public void test05_verifyTabsOnMainPage() {
        UIActions.click(grafanaLeftMenuPage.ToggleMenu);
        UIActions.click(grafanaLeftMenuPage.administrationLeftMenu);
        Verification.SoftVerifyLists(grafanaAdministrationMainPage.AdministrationMainPageList);
    }

    @Test(description = "Test 06 verify avatar image on main page")
    @Description("This test is verify avatar image on main page")
    public void test06_VerifyVisualElement()  {
        Verification.visualElement("grafanaAvatar.png");
    }
    @Test(description = "Test 07 search users in table",dataProvider = "data provider",dataProviderClass = utilities.ManageDDT.class)
    @Description("This test is verify and search users in table")
    public void test07_searchUsers(String user, String shouldBeExiste)  {
        UIActions.click(grafanaLeftMenuPage.ToggleMenu);
        UIActions.click(grafanaLeftMenuPage.administrationLeftMenu);
        UIActions.click(grafanaAdministrationMenuPage.usersAdmin);
        WebFlows.searchAndVerifyUsers(user,shouldBeExiste);
    }

}

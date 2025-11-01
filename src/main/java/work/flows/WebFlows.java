package work.flows;

import extensions.UIActions;
import extensions.Verification;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebFlows extends CommonOps {
    @Step("Business flow login of grafana")
    public static void login(String user, String pass) {
        UIActions.updateText(grafanalogin.txt_userName, user);
        UIActions.updateText(grafanalogin.txt_password, pass);
        UIActions.click(grafanalogin.btn_login);
        UIActions.click(grafanalogin.btn_skip);

    }

    @Step("Business flow login of sauceDemo")
    public static void loginSauce(String userName,String pass) {
        UIActions.updateText(sauceDemoMainPage.txt_UserName, userName);
        UIActions.updateText(sauceDemoMainPage.txt_Password, pass);
        UIActions.click(sauceDemoMainPage.btn_Login);
    }

    @Step("Business flow adding new users")
    public static void addingNewUsers(String name, String email, String userName, String pass) {
        UIActions.click(grafanaUsersPage.btn_NewUser);
        UIActions.updateText(grafanaAddNewUserPage.txt_Name, name);
        UIActions.updateText(grafanaAddNewUserPage.txt_Email, email);
        UIActions.updateText(grafanaAddNewUserPage.txt_Username, userName);
        UIActions.updateText(grafanaAddNewUserPage.txt_Password, pass);
        //Uninterruptibles.sleepUninterruptibly(2000, TimeUnit.MILLISECONDS);
        UIActions.click(grafanaAddNewUserPage.btn_submit);
    }

    @Step("Business flow delete last user")
    public static void deleteLastUser() {
        UIActions.click(grafanaUsersPage.rows.get(grafanaUsersPage.rows.size() - 1));
        UIActions.click(grafanaEditUserPage.btn_DeleteUser);
        UIActions.click(grafanaEditUserPage.btn_confirmDeletion);
    }

    @Step("Business flow search and verify users")
    public static void searchAndVerifyUsers(String user, String shouldBeExiste) {
        UIActions.updateTextSlowly(grafanaUsersPage.txt_search, user);
        if (shouldBeExiste.equalsIgnoreCase("exists")) {
            Verification.existenceOfElement(grafanaUsersPage.rows);
        } else if (shouldBeExiste.equalsIgnoreCase("not-exists")) {
            Verification.nonExistenceOfElement(grafanaUsersPage.rows);
        } else {
            throw new RuntimeException("needed to be exists or not exists");
        }
    }

}






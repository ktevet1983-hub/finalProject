package sanity;

import extensions.Verification;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;

@Listeners(utilities.Listeners.class)
public class SauceDemoWebTest extends CommonOps {

    @Test(description = "Test 01 verify header ")
    @Description("This test is verify header of Swag Labs page")
    public void test01_verifyHeader() {
        Verification.verifyEquals(sauceDemoSwagLabsPage.headerOfPage,"Swag Labs");
    }

//    @Test(description = "Test 02 .........")
//    @Description("This test is .........")
//    public void test02_verifyDefaultUser() {
//    }

//    @Test(description = "Test 03 ........")
//    @Description("This test is ........")
//    public void test03_verifyAddNewUser() {
//    }

//    @Test(description = "Test 04 ........")
//    @Description("This test is ........")
//    public void test04_verifyDeletionUser() {
//    }

//    @Test(description = "Test 05 .........")
//    @Description("This test is ........")
//    public void test05_verifyTabsOnMainPage() {
//    }

//    @Test(description = "Test 06 ........")
//    @Description("This test is ........")
//    public void test06_VerifyVisualElement()  {
//    }

//    @Test(description = "",dataProvider = "data provider",dataProviderClass = utilities.ManageDDT.class)
//    @Description("")
//    public void test07_searchUsers()  {
//    }
}

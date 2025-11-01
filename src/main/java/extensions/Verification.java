package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import utilities.CommonOps;
import java.util.List;
import static org.testng.Assert.*;

public class Verification extends CommonOps {


    @Step("Verify text elements")
    public static void verifyEquals(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));
        assertEquals(actual.getText(), expected);
    }

    @Step("Verify lists of elements")
    public static void verifyLists(List<WebElement> elems, int expected) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expected);

    }

    @Step("Verify lists of elements whit soft assert")
    public static void SoftVerifyLists(List<WebElement> elems) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        for (WebElement tab : elems) {
            softAssert.assertTrue(tab.isDisplayed(), tab.getText() + " is massing");
        }
        softAssert.assertAll("some elements are not displayed");
    }

    @Step("Getting visual element")
    public static void visualElement(String imageName)  {
            Pattern image = new Pattern(getData("ImageRepo") + imageName).similar(0.40);
        try {
            screen.find(image);
        } catch (FindFailed e) {
            fail("something wrong whit the fail "+e);
        }
    }
    @Step("Verify element displayed ")
    public static void existenceOfElement(List<WebElement> elements){
        assertTrue(elements.size() > 0);
    }
    @Step("Verify element displayed ")
    public static void nonExistenceOfElement(List<WebElement> elements){
        assertFalse(elements.size() > 0);
    }


}

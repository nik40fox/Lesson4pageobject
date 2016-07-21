package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginAndRegistrationPage;

/**
 * All possible tests for user Registration
 */
public class LoginAndRegistrationTests {

    @Test
    public void registrationWithEmptyFieldsTest() {
        LoginAndRegistrationPage registrationPage = new LoginAndRegistrationPage();
        //registrationPage.open();
        registrationPage.fillAndSubmitRegistrationForm("","","","");
        Assert.assertEquals(registrationPage.getAlertText(), "Blah-blah-blah", "Expected message was not displayed");
    }

    @DataProvider(name = "emptyFieldsValuesCombination")
    public static Object[][] createData() {
        return new Object[][] {
                {"", "Last", "a@b.c", "P@ssword"},
                {"First", "", "a@b.c", "ssword"},
        };
    }


    @Test(dataProvider = "emptyFieldsValuesCombination")
    public void registrationAllEmptyFieldsCombination(String first, String last, String email, String password) {
        LoginAndRegistrationPage registrationPage = new LoginAndRegistrationPage();
        //registrationPage.open();
        registrationPage.fillAndSubmitRegistrationForm("","","","");
        Assert.assertEquals(registrationPage.getAlertText(), "Blah-blah-blah", "Expected message was not displayed");
    }

    @Test
    public void successfulLoginTest () {
        LoginAndRegistrationPage registrationPage = new LoginAndRegistrationPage();
        Assert.assertNotNull(registrationPage);
    }

}

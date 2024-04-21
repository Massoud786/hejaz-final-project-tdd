package tdd.finalProject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalProject.base.BaseUITest;

public class LoginTest extends BaseUITest {
    @Test
    public void clickOnLoginBtnAndLoginWithValidCredential(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"supervisor");
        sendText(loginPage.loginPassword,"tek_supervisor");
        clickOnElement(loginPage.signInBtn);

        boolean isCustomerServicePortalTitleDisplayedAfterLogin = isElementDisplayed(loginPage.customerServicePortalPage);
        Assert.assertTrue(isCustomerServicePortalTitleDisplayedAfterLogin,
                "User should be taken to customer service portal page after successful login");
    }
    @Test
    public void loginWithInvalidCredentialsAndValidateErrorMessageAsExpected(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"Manager");
        sendText(loginPage.loginPassword,"Osprey_2024");
        clickOnElement(loginPage.signInBtn);

        String expectedErrorMessage = "User Manager not found";
        String actualErrorMessage = getElementText(loginPage.emailErrorMessage);
        String deletedErrorMessage = actualErrorMessage.replace("ERROR","").trim();
        Assert.assertEquals(deletedErrorMessage,expectedErrorMessage,
                "The expected error message should be same as actual error message");
    }
    @Test
    public void loginWithValidUserNameAndInvalidPassword(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"supervisor");
        sendText(loginPage.loginPassword,"Osprey_2024");
        clickOnElement(loginPage.signInBtn);

        String expectedErrorMessage = "Password not matched";
        String actualErrorMessage = getElementText(loginPage.invalidPassword);
        String deletedErrorMessage = actualErrorMessage.replace("ERROR","").trim();
        Assert.assertEquals(deletedErrorMessage,expectedErrorMessage);
    }
}

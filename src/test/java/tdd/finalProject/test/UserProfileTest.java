package tdd.finalProject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalProject.base.BaseUITest;

public class UserProfileTest extends BaseUITest {
    @Test
    public void loginWithValidInfoAndNavigateToCustomerServicePortalAndClickOnProfileBtnAndValidateInfoOnProfile(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"supervisor");
        sendText(loginPage.loginPassword,"tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.profileBtn);

        String actualAccountStatus = getElementText(userProfilePage.validateStatusOfTheAccount);
        String expectedAccountStatus = "Active";
        Assert.assertEquals(actualAccountStatus,expectedAccountStatus,
                "The expected account status should be same as actual status");

        String actualUserType = getElementText(userProfilePage.userTypeText);
        String expectedUserType = "CSR";
        Assert.assertEquals(actualUserType, expectedUserType,
                "The expected account user type text should be same as actual user type text");

        String actualFullName = getElementText(userProfilePage.validateFullName);
        String expectedFullName = "Supervisor";
        Assert.assertEquals(actualFullName,expectedFullName,
                "The expected Full Name should be same as actual Full Name");

        String actualUserName = getElementText(userProfilePage.validateUserName);
        String expectedUserName = "supervisor";
        Assert.assertEquals(actualUserName,expectedUserName,
                "The expected user name should be same as actual user name");

        String actualAuthority = getElementText(userProfilePage.validateAuthority);
        String expectedAuthority = "admin";
        Assert.assertEquals(actualAuthority,expectedAuthority,
                "The expected authority should be same as actual authority");

    }
    @Test
    public void loginWithValidInfoAndNavigateToCustomerServicePortalAndClickOnProfileBtnAndLogout(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"supervisor");
        sendText(loginPage.loginPassword,"tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.profileBtn);
        clickOnElement(userProfilePage.logoutBtn);
    }
    @Test
    public void validateUserIsTakenToHomePageAfterLogout(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"supervisor");
        sendText(loginPage.loginPassword,"tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.profileBtn);
        clickOnElement(userProfilePage.logoutBtn);

        boolean isUserTakenToHomePageAfterLogout = isElementDisplayed(homePage.letsGetYouStarted);
        Assert.assertTrue(isUserTakenToHomePageAfterLogout,
                "User should be taken to homepage after successful logout");
    }
}

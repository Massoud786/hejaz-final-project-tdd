package tdd.finalProject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalProject.base.BaseUITest;
import tdd.finalProject.utilities.RandomDataGeneratorUtilities;

public class CreateAccountTest extends BaseUITest {
    @Test
    public void clickOnCreatePrimaryAccountButton() {
        clickOnElement(homePage.createPrimaryAccountButton);
    }
    @Test
    public void validateFormTitleAsExpectedInCreateAccountPage(){
        clickOnElement(homePage.createPrimaryAccountButton);
        String expectedTitle = "Create Primary Account Holder";
        String actualTitle = getElementText(createAccountPage.createPrimaryAccountHolderTitle);
        Assert.assertEquals(actualTitle,expectedTitle,
                "The expected page title should match the actual title");
    }
    @Test
    public void fillUpTheFormClickOnCreateAccountButtonAndValidateUserNavigatesToSignPageAndValidateEmailAsExpected(){
        String randomEmail = RandomDataGeneratorUtilities.randomEmail();
        clickOnElement(homePage.createPrimaryAccountButton);
        sendText(createAccountPage.emailAddress,randomEmail);
        sendText(createAccountPage.firstName,"Matthew");
        selectFromDropDown(createAccountPage.gender,"Male");
        sendText(createAccountPage.employmentStatus,"Student");
        selectFromDropDown(createAccountPage.title,"Mr.");
        sendText(createAccountPage.lastName,"lastName");
        selectFromDropDown(createAccountPage.maritalStatus,"Single");
        sendText(createAccountPage.dateOfBirth,"01/08/1999");
        clickOnElement(createAccountPage.createAccountButton);

        boolean isSignUpYourAccountPageDisplayed = isElementDisplayed(signUpPage.SignUpYourAccountPage);
        Assert.assertTrue(isSignUpYourAccountPageDisplayed,
                "User should be taken to Sign up your account page after successful account creation");

        String actualEmail = getElementText(signUpPage.validateEmailAddressAsExpected);
        Assert.assertEquals(actualEmail, randomEmail,
                "The expected email should be same as actual email in Sign up your account page.");

    }
    @Test
    public void createAccountWithExistingEmailAndValidateErrorMessageAsExpected() {
        clickOnElement(homePage.createPrimaryAccountButton);
        sendText(createAccountPage.emailAddress, "osprey_9700@gmail.com");
        sendText(createAccountPage.firstName, "Matthew");
        selectFromDropDown(createAccountPage.gender, "Male");
        sendText(createAccountPage.employmentStatus, "Student");
        selectFromDropDown(createAccountPage.title, "Mr.");
        sendText(createAccountPage.lastName, "lastName");
        selectFromDropDown(createAccountPage.maritalStatus, "Single");
        sendText(createAccountPage.dateOfBirth, "01/08/1999");

        clickOnElement(createAccountPage.createAccountButton);
        String expectedErrorMessage = "Account with email osprey_9700@gmail.com is exist";
        String actualErrorMessage = getElementText(createAccountPage.errorMessage);
        String deletedErrorText = actualErrorMessage.replace("ERROR", "").trim();
        Assert.assertEquals(deletedErrorText, expectedErrorMessage,
                "The expected error message should be same as actual error message");
    }
}

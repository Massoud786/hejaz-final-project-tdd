package tdd.finalProject.test;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalProject.base.BaseUITest;

public class PlansTest  extends BaseUITest {
    @Test
    public void navigateToCustomerServicePortalWithValidCredentialsAndNavigateToPlanPage() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.loginPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(planPage.planBtn);
    }
    @Test
    public void validateFourRowOfDataArePresentAfterNavigatingToPlanPage() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.loginPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(planPage.planBtn);

        int actualRowOfData = planPage.countRowOfData();
        int expectedRowOfData = 4;
        Assert.assertEquals(actualRowOfData,expectedRowOfData,
                "Only 4 row of data should be present in plans page");
    }
    @Test
    public void validateCreateDateAndExpirationDateAfterLoginAndNavigatingToPlansPage(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"supervisor");
        sendText(loginPage.loginPassword,"tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(planPage.planBtn);

        String actualCreationDate = getElementText(planPage.creationDate);
        String expectedCreationDate = "April 21, 2024";
        Assert.assertEquals(actualCreationDate, expectedCreationDate,
                "Expected creation date should match actual creation date");

        String actualExpirationDate = getElementText(planPage.expirationDate);
        String expectedExpirationDate = "April 22, 2024";
        Assert.assertEquals(actualExpirationDate, expectedExpirationDate,
                "Expected expiration date should match actual expiration date");
    }
}

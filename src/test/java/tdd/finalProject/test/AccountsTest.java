package tdd.finalProject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalProject.base.BaseUITest;

public class AccountsTest extends BaseUITest {
    @Test
    public void loginWithValidInfoAndNavigateToAccountsAndVerifyFivePageIsDefault(){
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName,"supervisor");
        sendText(loginPage.loginPassword,"tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(accountsPage.accountBtn);

        String actualRow = getElementText(accountsPage.page5Row);
        String expectedRow = "Show 5";
        Assert.assertEquals(actualRow,expectedRow,
                "The expected row number should be same as actual row number");
    }
    @Test
    public void loginWithValidInfoAndNavigateToAccountsAndChangePageToTenAndValidateItsTableRecord() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.loginPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(accountsPage.accountBtn);
        selectFromDropDown(accountsPage.pageTen, "Show 10");
        int actualPageTenRecord = accountsPage.countRecordPageTen();
        int expectedPageTenRecord = 10;
        Assert.assertEquals(actualPageTenRecord,expectedPageTenRecord,
                "10 emails should be displayed after navigating to page 10");
    }
    @Test
    public void loginWithValidInfoAndNavigateToAccountsAndChangePageToTwentyFiveAndValidateItsTableRecord() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.loginPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(accountsPage.accountBtn);
        selectFromDropDown(accountsPage.page25, "Show 25");
        int actualPageTwentyFiveRecord = accountsPage.countRecordPageTwentyFive();
        int expectedPageTwentyFiveRecord = 25;
        Assert.assertEquals(actualPageTwentyFiveRecord,expectedPageTwentyFiveRecord,
                "25 emails should be displayed after navigating to page 25. ");
    }
    @Test
    public void loginWithValidInfoAndNavigateToAccountsAndChangePageToFiftyAndValidateItsTableRecord() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.loginPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(accountsPage.accountBtn);
        selectFromDropDown(accountsPage.pageFifty, "Show 50");
        int actualPageFiftyRecord = accountsPage.countRecordPageFifty();
        int expectedPageFiftyRecord = 50;
        Assert.assertEquals(actualPageFiftyRecord, expectedPageFiftyRecord,
                "50 emails should be displayed after navigating to page 50");
    }
}

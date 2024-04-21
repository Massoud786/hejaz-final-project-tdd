package tdd.finalProject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.finalProject.base.BaseUITest;

public class HomePageTest extends BaseUITest {
    @Test
    public void validateTitleIsTekInsuranceApp(){
        String expectedTitle = "TEK Insurance App";
        String actualTitle = getElementText(homePage.tekInsuranceAppTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"The expected page title should be same as actual title");

    }
    @Test
    public void validateCreatePrimaryAccountButtonIsExist(){
        boolean isCreatePrimaryAccountButtonExist = isElementDisplayed(homePage.createPrimaryAccountButton);
        Assert.assertTrue(isCreatePrimaryAccountButtonExist);
    }
}

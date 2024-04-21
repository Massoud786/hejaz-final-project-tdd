package tdd.finalProject.base;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import tdd.finalProject.page.CreateAccountPage;
import tdd.finalProject.page.HomePage;
import tdd.finalProject.page.LoginPage;
import tdd.finalProject.page.SignUpPage;
import tdd.finalProject.utilities.SeleniumUtilities;

@Listeners({ExtentITestListenerAdapter.class})
    public class BaseUITest extends SeleniumUtilities {
    public HomePage homePage;
    public CreateAccountPage createAccountPage;
    public SignUpPage signUpPage;
    public LoginPage loginPage;
        @BeforeMethod
        public void initiateTestMethod(){
            super.openBrowser();
            homePage = new HomePage();
            createAccountPage = new CreateAccountPage();
            signUpPage = new SignUpPage();
            loginPage = new LoginPage();


        }
        @AfterMethod
        public void entTestMethod(ITestResult result) throws InterruptedException {
            Thread.sleep(6000);
            if(result.getStatus()==ITestResult.FAILURE){
                TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
                String screenShot = takesScreenshot.getScreenshotAs(OutputType.BASE64);
                ExtentTestManager.getTest().fail("Test Failed Taking Screen Shot"
                        , MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot).build());
            }
            super.quitBrowser();
        }
}

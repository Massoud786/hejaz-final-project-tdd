package tdd.finalProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.finalProject.utilities.SeleniumUtilities;

public class LoginPage extends SeleniumUtilities {
    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='chakra-button css-ez23ye']")
    public WebElement loginBtn;
    @FindBy(name = "username")
    public WebElement userName;
    @FindBy(name = "password")
    public WebElement loginPassword;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]")
    public WebElement signInBtn;
    @FindBy(xpath = "//h2[@class='chakra-heading css-1at26de']")
    public WebElement customerServicePortalPage;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div/div")
    public WebElement emailErrorMessage;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div/div")
    public WebElement invalidPassword;
}

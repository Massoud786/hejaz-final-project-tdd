package tdd.finalProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.finalProject.utilities.SeleniumUtilities;

public class CreateAccountPage extends SeleniumUtilities {
    public CreateAccountPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath = "//h2[@class='chakra-heading css-1jb3vzl']")
    public WebElement createPrimaryAccountHolderTitle;
    @FindBy(id = "email")
    public WebElement emailAddress;
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "gender")
    public WebElement gender;
    @FindBy(name = "employmentStatus")
    public WebElement employmentStatus;
    @FindBy(id = "title")
    public WebElement title;
    @FindBy(name = "lastName")
    public WebElement lastName;
    @FindBy(id = "maritalStatus")
    public WebElement maritalStatus;
    @FindBy(name = "dateOfBirth")
    public WebElement dateOfBirth;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]")
    public WebElement createAccountButton;
    @FindBy(xpath = "//div[@class='chakra-alert banner-error css-1ykemat']")
    public WebElement errorMessage;
}

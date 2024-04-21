package tdd.finalProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.finalProject.utilities.SeleniumUtilities;

public class HomePage extends SeleniumUtilities {
    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath= "//a[@class='chakra-button css-1jp0m7c']")
    public WebElement createPrimaryAccountButton;
    @FindBy(xpath = "//h2[@class='chakra-heading css-1at26de']")
    public WebElement tekInsuranceAppTitle;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/h2[1]")
    public WebElement letsGetYouStarted;
}

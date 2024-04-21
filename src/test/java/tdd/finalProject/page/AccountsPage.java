package tdd.finalProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.finalProject.utilities.SeleniumUtilities;

import java.util.List;

public class AccountsPage extends SeleniumUtilities {
    public AccountsPage(){
        PageFactory.initElements(getDriver(),this);
    }
    public int countRecordPageTen(){
        return pageTenRecord.size();
    }
    public int countRecordPageTwentyFive(){
        return pageTwentyFiveRecord.size();
    }
    public int countRecordPageFifty(){
        return pageFiftyRecord.size();
    }
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/a[1]")
    public WebElement accountBtn;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[1]")
    public WebElement page5Row;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement pageTen;
    @FindBy(xpath = "//tbody[@class='css-0']/tr")
    public List<WebElement> pageTenRecord;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement page25;
    @FindBy(xpath = "//tbody[@class='css-0']/tr")
    public List<WebElement> pageTwentyFiveRecord;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement pageFifty;
    @FindBy(xpath = "//tbody[@class='css-0']/tr")
    public List<WebElement> pageFiftyRecord;



}

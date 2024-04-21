package tdd.finalProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.finalProject.utilities.SeleniumUtilities;

import java.util.List;

public class PlanPage extends SeleniumUtilities {
        public PlanPage(){
            PageFactory.initElements(getDriver(),this);
        }
        public int countRowOfData(){
            return rowOfData.size();
        }

        @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/a[2]")
        public WebElement planBtn;
       @FindBy(xpath = "//tbody[@class='css-0']/tr")
       public List<WebElement> rowOfData;
        @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]")
        public WebElement creationDate;
        @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]")
        public WebElement expirationDate;
}

package tdd.finalProject.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tdd.finalProject.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtilities extends BaseSetup {
    private static final Logger LOGGER = LogManager.getLogger(SeleniumUtilities.class);

    public WebDriverWait getWait(){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    public WebElement waitForVisibility (WebElement element){
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }
    public WebElement waitForClickable(WebElement element){
        return getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public void clickOnElement(WebElement element){
        LOGGER.info("Click on element {}", element);
        waitForClickable(element).click();
    }
    public void sendText(WebElement element, String textValue){
        LOGGER.info("Send key to element {} with value {} ",element, textValue);
        waitForVisibility(element).sendKeys(textValue);
    }
    public boolean isElementDisplayed(WebElement element){
        LOGGER.info("Checking element is displayed {}", element);
        return waitForVisibility(element).isDisplayed();
    }
    public boolean isElementEnabled(WebElement element){
        LOGGER.info("Check element is enabled "+ element);
        return waitForVisibility(element).isEnabled();
    }
    public String getElementText(WebElement element){
        LOGGER.info("Getting Element Text" + element);
        return waitForVisibility(element).getText();
    }
    public void selectFromDropDown(WebElement element, String visibleText){
        WebElement selectElement = waitForVisibility(element);
        Select select = new Select(selectElement);
        select.selectByVisibleText(visibleText);
    }
}

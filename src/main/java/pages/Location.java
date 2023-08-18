package pages;

import baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class Location extends BaseClass {
    @FindBy(id ="deftlocation")
    WebElement drop_location;
    @FindBy(xpath="//p[text()='location Required']")
    WebElement error;
    @FindBy(xpath="//div[@value='None']")
    WebElement None;
    @FindBy(xpath="//div[@value='NCR']")
    WebElement NCR;
    @FindBy(xpath="//div[@value='Bangalore']")
    WebElement Bangalore;
    @FindBy(xpath="//div[@value='Hyderabad']")
    WebElement Hyderabad;
    @FindBy(xpath="//div[@value='Mumbai']")
    WebElement Mumbai;
    @FindBy(xpath="//div[@value='Pune']")
    WebElement Pune;
    public Location(WebDriver driver) throws IOException {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String location(String pass) throws InterruptedException, AWTException {

        Thread.sleep(3000);
        drop_location.click();
        Thread.sleep(3000);
        String value = null;
        if (pass.equals("None")) {
            value=None.getText();
            None.click();
        } else if (pass.equals("NCR")) {
            value=NCR.getText();
            NCR.click();
        } else if (pass.equals("Bangalore")) {
            value=Bangalore.getText();
            Bangalore.click();
        } else if (pass.equals("Mumbai")) {
            value=Mumbai.getText();
            Mumbai.click();
        } else if (pass.equals("Hyderabad")) {
            value=Hyderabad.getText();
            Hyderabad.click();

        } else if (pass.equals("Pune")) {
            value=Pune.getText();
            Pune.click();
        }
        return value;
    }
}

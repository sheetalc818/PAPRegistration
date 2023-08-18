package pages;

import baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class Registration extends BaseClass {
    @FindBy(xpath ="//button[text()='REGISTER NOW']")
    WebElement btn_Reg;
    public Registration(WebDriver driver) throws IOException {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void click_RegisterNow() throws InterruptedException {

        Thread.sleep(3000);
        btn_Reg.click();


    }
}

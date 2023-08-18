package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public WebDriver driver;
    public Properties prop;

    public BaseClass() throws IOException {
        prop = new Properties();
        FileInputStream ip;
        ip = new FileInputStream(
                "src/main/java/config/Registration.properties");
        prop.load(ip);
    }
    public void  initialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("Url"));
    }
}

package TopcoderForums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dilhani Gunawardhana\\Downloads\\TC\\ChallengeForums\\src\\main\\java\\TopcoderForums\\data.properties");
        properties.load(fileInputStream);
        String browserName = properties.getProperty("browser");
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilhani Gunawardhana\\Downloads\\TC\\ChallengeForums\\src\\main\\java\\TopcoderForums\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {

        } else {

        }

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
    }
}

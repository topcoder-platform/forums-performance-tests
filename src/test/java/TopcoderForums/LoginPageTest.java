package TopcoderForums;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginPageTest extends TestBase {
    @Test
    public void loginPageNavigation() throws IOException, InterruptedException {
        driver=initializeDriver();
        driver.get("https://vanilla.topcoder-dev.com/");
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[2]/div/div/div/div/div[2]/aside/div[2]/div/a")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/div[2]/div[2]/span/div/div/div/div/div/div/div/div/div[2]/div[3]/div[1]/div/input")).sendKeys("sdguntcqa");
        driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/div[2]/div[2]/span/div/div/div/div/div/div/div/div/div[2]/div[3]/div[2]/div[1]/div/input")).sendKeys("T0pc0der@123");
        driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/button/span/span")).click();

    driver.findElement(By.xpath("//*[@id=\"Category_1\"]/div/div[2]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Category_2708\"]/div/div[2]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"Discussion_3130\"]/div/div[2]/a")).click();
        for(int i =0;i<140;i++) {
            //driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[2]/div/div/div/div/div[2]/main/div[4]/h2")).click();
            driver.findElement(By.xpath("//*[@id=\"Form_Comment\"]/div/div[1]/div/div/div[1]/button[15]")).click();
            //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"Form_PostComment\"]")).click();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"Form_Comment\"]/div/div[3]/span/a[2]")).click();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//*[@id=\"Discussion_3130\"]/div/div[2]/a")).click();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            System.out.println("Posted "+ i + " times");
        }

    //driver.close();

           }
}

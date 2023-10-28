package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assertions {
    /* verify that the login button is enabled
    verify that you are able to login into HRMS website
     */

    public static WebDriver driver;

    @BeforeMethod
    public void SetupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void login() {
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        // verify the login button enabled
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        boolean status = loginBtn.isEnabled();
        // this status=false is to force to test case to fail for learning purpose
        // status=false;
        Assert.assertTrue(status);
    }

}

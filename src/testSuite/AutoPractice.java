package testSuite;

import browserTest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoPractice extends BaseTest {

    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void invalidSignIn() {

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("Prime263@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("£$");
        driver.findElement(By.id("SubmitLogin")).click();
        String expMsg = "There is 1 error";
        WebElement msg = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Test Failed", expMsg, actMsg);

    }
}

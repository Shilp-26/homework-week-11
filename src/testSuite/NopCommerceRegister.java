package testSuite;

import browserTest.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class NopCommerceRegister extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void nopRegister() {
        driver.findElement(By.className("ico-register")).click();//open register page
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();//select male
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Jack");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Anders");

        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByValue("20");
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByValue("5");
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("1976");

        driver.findElement(By.id("Email")).click();
        Random randomEmail = new Random();
        int randomInt = randomEmail.nextInt(1000);
        driver.findElement(By.id("Email")).sendKeys("username" + randomInt + "@gmail.com");

        driver.findElement(By.id("Company")).sendKeys("BubbleMind");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("Prime123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Prime123");
        driver.findElement(By.id("register-button")).click();

    }
}

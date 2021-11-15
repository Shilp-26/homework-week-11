package testSuite;

import browserTest.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NopCommerce extends BaseTest {

    String baseUrl = "https://www.google.co.uk/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"))
                .sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[1]/div[1]/div[2]" +
                "/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/h3[1]")).click();
    }

    @Test
    public void navigateToComputersPage() {

        driver.findElement(By.partialLinkText("Computers")).click();
        String expMsg = "Computers";
        WebElement msg = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Computers page is not displayed", expMsg, actMsg);

    }

    @Test
    public void navigateToElectronicsPage() {

        driver.findElement(By.partialLinkText("Electronics")).click();
        String expMsg = "Electronics";
        WebElement msg = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Electronics page is not displayed", expMsg, actMsg);
    }

    @Test
    public void navigateToApparelPage() {
        driver.findElement(By.partialLinkText("Apparel")).click();
        String expMsg = "Apparel";
        WebElement msg = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Apparel page is not displayed", expMsg, actMsg);
    }

    @Test
    public void navigateToDigitalDownloadsPage() {
        driver.findElement(By.partialLinkText("Digital")).click();
        String expMsg = "Digital downloads";
        WebElement msg = driver.findElement(By.xpath("//h1[contains(text(),'Digital')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Digital downlaods page is not displayed", expMsg, actMsg);
    }

    @Test
    public void navigateToBooksPage() {
        driver.findElement(By.partialLinkText("Books")).click();
        String expMsg = "Books";
        WebElement msg = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Books page is not displayed", expMsg, actMsg);
    }

    @Test
    public void navigateToJewelryPage() {
        driver.findElement(By.partialLinkText("Jewelry")).click();
        String expMsg = "Jewelry";
        WebElement msg = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Jewelry page is not displayed", expMsg, actMsg);
    }

    @Test
    public void navigateToGiftCardsPage() {
        driver.findElement(By.partialLinkText("Gift")).click();
        String expMsg = "Gift Cards";
        WebElement msg = driver.findElement(By.xpath("//h1[contains(text(),'Gift ')]"));
        String actMsg = msg.getText();
        Assert.assertEquals("Gift Cards page is not displayed", expMsg, actMsg);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}

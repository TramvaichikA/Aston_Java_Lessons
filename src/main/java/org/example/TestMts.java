package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestMts {
  /*  WebDriver driver=new ChromeDriver();
    @BeforeEach
    public void driverSetUp() {
        driver.get("https://www.mts.by/");
    }
 */
    @Test
    @Description("Name")
    public void someTest1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        WebElement button = driver.findElement(By.className("pay__wrapper"));
        button.getText();
        Assertions.assertEquals("Онлайн пополнение без комиссии", button.getText());
        driver.quit();
    }

    @Test
    @Description("Logotip")
 public  void someTest2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        button1.getText();
        Assertions.assertEquals("Visa", button1.getText());
        WebElement button2 = driver.findElement(By.className("pay__partners");
        button2.getText();
        Assertions.assertEquals("Verified By Visa", button2.getText());
        WebElement button3 = driver.findElement(By.id("pay-section"));
        button3.getText();
        Assertions.assertEquals("MasterCard", button3.getText());
        WebElement button4 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[3]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
        button4.getText();
        Assertions.assertEquals("MasterCard Secure Code", button4.getText());
        WebElement button5 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[3]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
        button5.getText();
        Assertions.assertEquals("Белкарт", button5.getText());
        driver.quit();
    }

    @Test
    @Description("Link")
    public void someTest3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        WebElement button = driver.findElement(By.id("pay-section"));
        button.click();
        driver.getCurrentUrl();
        Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl());
        driver.quit();
    }
        @Test
@Description("Folder and button")
        public  void someTest4() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            driver.get("https://www.mts.by/");
            String ex  =  driver.getWindowHandle();
            WebElement inputPhone = driver.findElement(By.id("connection-phone"));
            inputPhone.click();
            inputPhone.sendKeys("297777777");
            WebElement sum = driver.findElement(By.id("connection-sum"));
            sum.sendKeys("500");
            WebElement key_continiue=driver.findElement("pay-connection");
            key_continiue.click();

            Assertions.assertEquals(ex, driver.getWindowHandle());
            driver.quit();
        }
    /*     @AfterEach
    public void driveSetUp1(){
        driver.quit();
         }
     */
           //         переход на /html/body/app-root/div/div/app-header/header/div



}

package ru.relex.education.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Task5 {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        FirefoxOptions options = new FirefoxOptions().setLegacy(true);
        options.setBinary(new FirefoxBinary(new File("D:\\Tools\\Browser\\Mozilla Firefox ERS 45\\firefox.exe")));
        WebDriver driver = new FirefoxDriver(options);

        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void FirstTest() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        //добавить проверку
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}

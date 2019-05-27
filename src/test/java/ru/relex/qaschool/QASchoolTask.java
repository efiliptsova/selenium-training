package ru.relex.education.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class QASchoolTask {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        //driver = new InternetExplorerDriver();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Task2() {
        driver.get("https://relex.ru/ru/");
        driver.findElement(By.name("q")).sendKeys("QA-школа");
        driver.findElement(By.name("s")).click();
        // Некорректный, т к не прямой потомок , т е "//*[@class='search-page']//a" вместо "//*[@class='search-page']/a"
        // List<WebElement> searches = driver.findElements(By.xpath("//*[@class='search-page']//a"));
        // неоптимальный локатор
        //Assert.assertTrue(driver.findElements(By.xpath("//div[@id='relex-panel-main']/div/div/div[2]/div/div/a")).size() > 0);
        //List <WebElement> elems = driver.findElements(By.tagName("a"));
        //Assert.assertTrue(elems.size() > 0);
        // более оптимальный локатор
        Assert.assertTrue(driver.findElements(By.xpath("//div[@class='search-page']/a")).size() > 0);

        driver.findElement(By.linkText("В РЕЛЭКС стартуют два образовательных проекта")).click();
        Assert.assertEquals(driver.findElement(By.className("r-h2")).getText(), "В РЕЛЭКС стартуют два образовательных проекта");
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}

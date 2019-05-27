package ru.relex.qaschool;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest {
  private WebDriver driver;

  @Before
  public void start() {
    driver = new ChromeDriver();
  }

  @Test
  public void LoginTest() throws InterruptedException {
    driver.get("http://q360-dea11.cloud.common.relex.ru/");
    Thread.sleep(2000);
    driver.findElement(By.id("mat-input-0")).sendKeys("p_petrov");
    driver.findElement(By.id("mat-input-1")).sendKeys("12345678");
    driver.findElement(By.xpath("//span[text()='Войти']")).click();
    // или
    //driver.findElement(By.xpath("//span[contains(text(),'Войти')]")).click();
    Thread.sleep(2000);
    Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Мои результаты");
    Assert.assertEquals(driver.findElement(By.className("pl-10")).getText(), "Петров Петр");
  }


  @After
  public void stop() {
    driver.quit();
    driver = null;
  }

}

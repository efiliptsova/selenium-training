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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest_v2 {
  private WebDriver driver;

  @Before
  public void start() {
    driver = new ChromeDriver();
  }

  @Test
  public void LoginTest() throws InterruptedException {
    driver.get("http://q360-dea11.cloud.common.relex.ru/");
    new WebDriverWait(driver, 10).until(
            ExpectedConditions.elementToBeClickable(By.id("mat-input-0")));
    driver.findElement(By.id("mat-input-0")).sendKeys("p_petrov");
    driver.findElement(By.id("mat-input-1")).sendKeys("12345678");
    driver.findElement(By.xpath("//span[contains(text(),'Войти')]")).click();
    WebElement header = driver.findElement(By.xpath("//h1"));
    new WebDriverWait(driver, 10).until(
            ExpectedConditions.textToBePresentInElement(header, "Мои результаты"));
    Assert.assertEquals(header.getText(), "Мои результаты");
    Assert.assertEquals(driver.findElement(By.className("pl-10")).getText(),
            "Петров Петр");
  }

  @After
  public void stop() {
    driver.quit();
    driver = null;
  }

}

package ru.relex.qaschool;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class LoginTest_v4 {

//System.setProperty("selenide.browser", "Chrome");

  @Test
  public void LoginTest() {
    open("http://q360-dea11.cloud.common.relex.ru/");
    $("#mat-input-0").setValue("p_petrov");
    $("#mat-input-1").setValue("12345678");
    $x("//span[contains(text(),'Войти')]").click();
    $x("//h1").shouldHave(exactText("Мои результаты"));
    $(".pl-10").shouldHave(exactText("Петров Петр"));
  }


}

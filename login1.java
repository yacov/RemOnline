package telran.j.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Login1 extends telran.j.selenium.pages.TestBase {
private boolean acceptNextAlert = true;
private StringBuffer verificationErrors = new StringBuffer () ;
@Test
public void testLogin1 () throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//span")).click();
    driver.findElement(By.id("l-auth-email")).clear();
    driver.findElement(By.id("l-auth-email")).sendKeys("cronista@yandex.ru");
    driver.findElement(By.id("l-auth-login")).clear();
    driver.findElement(By.id("l-auth-login")).sendKeys("rerrr");
    driver.findElement(By.id("l-auth-pass")).clear();
    driver.findElement(By.id("l-auth-pass")).sendKeys("121343");
    driver.findElement(By.xpath("//div[5]/button")).click();
    try {
      assertEquals("Моя мастерская", driver.findElement(By.xpath("//span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
}

private boolean isElementPresent (By by) {
try {
driver.findElement (by);
return true;
} catch (NoSuchElementException e) {
return false;
}
}

private String closeAlertAndGetItsText() {
try {
Alert alert = driver.switchTo().alert();
String alertText = alert.getText ();
if (acceptNextAlert) {
alert.accept();
} else {
alert.dismiss();
}
return alertText;
} finally {
acceptNextAlert = true;
}
}
}

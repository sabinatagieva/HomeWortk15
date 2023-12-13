package base.mathods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.driver.DriverInit.getDriver;

public class BaseMethods {
    private WebDriverWait wait = null;

    protected void click(By locator) {
        waiter(locator).click();
    }

    protected void click(By locator, int time) {
        waiter(locator, time).click();
    }

    protected void send(By locator) {
        waiter(locator).sendKeys(text);
    }

    protected void send(By locator, String text, int time) {
        waiter(locator, time).sendKeys(text);
    }

    protected void send(By locator, Keys keys) {
        waiter(locator).sendKeys(keys);
    }

    protected void send(By locator, Keys keys, int time) {
        waiter(locator, time).sendKeys(keys);
    }

    protected String getText(By locator) {
        return waiter(locator).getText();
    }

    protected String getText(By locator, int time) {
        return waiter(locator, time).getText();
    }

    protected WebElement waiter(By locator) {
        return waits(10).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected WebElement waiter(By locator, int time) {
        return waits(time).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    private WebDriverWait waits(int time) {
        return wait = new WebDriverWait(getDriver(), time);
    }

}

package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {

    private static WebDriver driver;
    private String id;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='j93WEe']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='N10B9']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='XSr6wc']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='lVjWed']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='qCp9A']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='YovRWb']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='KN1kY']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='pPHzQc']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='xAP7E']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='bkEvMb']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='WxTTNd']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='Ax5wH']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='Pt8tGc']")).sendKeys(Keys.ENTER);
        assertEquals(driver.findElement(By.xpath("//span [contains(text(), '(1 + 2) × 3 - 40 ÷ 5') and @jsname='ubtiRe']")));
        assertEquals(driver.findElement(By.xpath("//span [contains(text(), '1') and @jsname='VssY5c']")));
        driver.quit();
    }

    private void assertEquals(WebElement element) {
    }

    @Test
    public void test2() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='abcgof']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='WxTTNd']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='bkEvMb']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='Pt8tGc']")).sendKeys(Keys.ENTER);
        assertEquals(driver.findElement(By.xpath("//span [contains(text(), '6 ÷ 0') and @jsname='ubtiRe']")));
        assertEquals(driver.findElement(By.xpath("//span [contains(text(), 'Infinity') and @jsname='VssY5c']")));
        driver.quit();
    }

    @Test
    public void test3() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='aN1RFf']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='Pt8tGc']")).sendKeys(Keys.ENTER);
        assertEquals(driver.findElement(By.xpath("//span [contains(text(), 'sin(') and @jsname='ubtiRe']")));
        assertEquals(driver.findElement(By.xpath("//span [contains(text(), 'Error') and @jsname='VssY5c']")));
        driver.quit();
    }
}




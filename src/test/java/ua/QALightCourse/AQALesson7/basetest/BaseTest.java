package ua.QALightCourse.AQALesson7.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    protected void driverInit() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://diia.gov.ua/");
    }

    @AfterMethod
    protected void driverQuit() {
        this.driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}


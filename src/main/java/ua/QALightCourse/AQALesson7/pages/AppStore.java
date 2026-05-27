package ua.QALightCourse.AQALesson7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppStore {

    private final WebDriver driver;

    public AppStore(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Get App Store application title.")
    public String getTitle() {
        return driver.findElement(By.xpath("//h1//span[text()='Дія']")).getText();
    }
}

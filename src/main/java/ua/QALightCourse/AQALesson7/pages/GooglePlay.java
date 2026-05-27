package ua.QALightCourse.AQALesson7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePlay {

    private final WebDriver driver;

    public GooglePlay(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Get Google Play application title")
    public String getTitle() {
        return driver.findElement(By.xpath("//h1//span[text()='Дія']")).getText();
    }
}


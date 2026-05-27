package ua.QALightCourse.AQALesson7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicePage {
    private final WebDriver driver;

    public ServicePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Verify that service page is selected")
    public String getTitleOfService()
    {
        return driver.findElement(By.xpath("//h1[@class='service-type_title']")).getText();
    }
}

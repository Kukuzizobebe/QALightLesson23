package ua.QALightCourse.AQALesson7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QuestionAndAnswersPage {

    private final WebDriver driver;
    private final WebDriverWait waiter;


    public QuestionAndAnswersPage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Step("Find and choose question: <{question}>.")
    public void chooseQuestion(String question)
    {
        driver.findElement(By.xpath(String.format("//a[@class='faq_item-answer-link' and contains(.,'%s')]",question))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'justify-content-xl-between')]")));
    }

}

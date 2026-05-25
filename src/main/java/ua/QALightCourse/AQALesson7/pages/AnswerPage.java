package ua.QALightCourse.AQALesson7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AnswerPage {

    private final WebDriver driver;
    private final WebDriverWait waiter;

    public AnswerPage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Step("Get answer for question: <{question}>.")
    public String getAnswerFromQuestion()
    {
        WebElement answerTextForQuestion = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-8']")));
        return answerTextForQuestion.getText();

    }
}

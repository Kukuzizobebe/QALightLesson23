package ua.QALightCourse.AQALesson7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultPage {
    private final WebDriver driver;
    private final WebDriverWait waiter;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Step("Open service <{service}> from search results")
    public void openServiceFromSearchResult(String service)
    {
        driver.findElement(By.xpath(String.format("//a[@class='search-res_list-item-title' and text()='%s']",service))).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='service-type_title']")));
    }
}

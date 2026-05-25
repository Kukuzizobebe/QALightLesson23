package ua.QALightCourse.AQALesson7.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.QALightCourse.AQALesson7.enums.ApplicationStore;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;
    private final WebDriverWait waiter;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Step("Click to <{appStore}> button.")
    public void openStoreForDownloadApplicationFooter(ApplicationStore appStore) {
        String mainTab = driver.getWindowHandle();
        By storeDownloadFooter = By.xpath(String.format("//div[@class='col-7 col-sm-12']//a[contains(@title,'App Store')]", appStore.getStoreName()));
        WebElement storeDownloadButtonForOS = waiter.until(ExpectedConditions.visibilityOfElementLocated(storeDownloadFooter));
        storeDownloadButtonForOS.click();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(mainTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1//span[text()='Дія']")));
    }

    @Step("Click to questions and answers section.")
    public void openQuestionAndAnswersSection()
    {
        driver.findElement(By.xpath("//a[@class='menu_list-link' and text()='Питання та відповіді']")).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Поширені запитання']")));
    }

    @Step("Search service <{service}>")
    public void searchService(String service){
        driver.findElement(By.xpath("//input[@id='homeSearch']")).sendKeys(service);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format("//a[@class='search-res_list-item-title' and text()='%s']",service))));
    }


}
package ua.QALightCourse.AQALesson2;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;

public class TitleVerificationTest {

    public static void main(String[] args) throws InterruptedException {
        String searchWord = "Ipad";
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            Thread.sleep(3000);

            WebElement inputField = driver.findElement(By.xpath("//input"));
            inputField.sendKeys(searchWord);

            Thread.sleep(3000);

            WebElement searchButton = driver.findElement(By.xpath("//button[starts-with(@class,'search__btn')]"));
            searchButton.click();

            Thread.sleep(3000);

            WebElement title = driver.findElement(By.xpath("//div[@class='search__title']"));
            String titleText = title.getText();

            String errorMessage = format("Title page is incorrect. It doesn`t cointains <$s> search word", searchWord);
            Assert.assertTrue(titleText.contains(searchWord), errorMessage);
        } finally {
            driver.quit();
        }
    }
}

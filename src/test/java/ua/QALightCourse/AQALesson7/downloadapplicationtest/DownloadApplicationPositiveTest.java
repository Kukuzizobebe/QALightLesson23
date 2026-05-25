package ua.QALightCourse.AQALesson7.downloadapplicationtest;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.QALightCourse.AQALesson7.basetest.BaseTest;
import ua.QALightCourse.AQALesson7.enums.ApplicationStore;
import ua.QALightCourse.AQALesson7.pages.AppStore;
import ua.QALightCourse.AQALesson7.pages.GooglePlay;
import ua.QALightCourse.AQALesson7.pages.HomePage;

public class DownloadApplicationPositiveTest extends BaseTest {

    @Test
    @Description("This test for open Google Play page for application Dia")
    @Epic("Mobile Application")
    @Feature("Application Download")
    @Story("Open Google Play page")
    @Link(name = "Requirements", url = "https://uk.wikipedia.org/wiki/Dia")
    @Issue("JIRA-14889")
    public void shouldOpenGooglePlayPage() {

        String expectedPageTitle = "Дія";
        HomePage homePage = new HomePage(getDriver());
        homePage.openStoreForDownloadApplicationFooter(ApplicationStore.GOOGLE_PLAY);

        GooglePlay googlePlayPage = new GooglePlay(getDriver());
        String actualPageTitle = googlePlayPage.getTitle();
        Assert.assertTrue(expectedPageTitle.contains(actualPageTitle));
    }

    @Test
    @Description("This test for open App Store page for application Dia")
    @Epic("Mobile Application")
    @Feature("Application Download")
    @Story("Open App Store page")
    @Link(name = "Requirements", url = "https://uk.wikipedia.org/wiki/Dia")
    @Issue("JIRA-14888")
    public void shouldOpenAppStorePage() {

        String expectedPageTitle = "Дія";
        HomePage homePage = new HomePage(getDriver());
        homePage.openStoreForDownloadApplicationFooter(ApplicationStore.APP_STORE);

        AppStore appStore = new AppStore(getDriver());
        String actualPageTitle = appStore.getTitle();
        Assert.assertTrue(expectedPageTitle.contains(actualPageTitle));
    }

}

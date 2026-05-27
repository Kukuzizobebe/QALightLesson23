package ua.QALightCourse.AQALesson7.servicessearchtest;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.QALightCourse.AQALesson7.basetest.BaseTest;
import ua.QALightCourse.AQALesson7.pages.HomePage;
import ua.QALightCourse.AQALesson7.pages.SearchResultPage;
import ua.QALightCourse.AQALesson7.pages.ServicePage;

public class ServiceSearchPositiveTest extends BaseTest {

    @Test
    @Description("This test verifies that user can find service using search input")
    @Epic("Search page")
    @Feature("Service search")
    @Story("Search service by name")
    @Link(name = "Requirements", url = "https://uk.wikipedia.org/wiki/Dia")
    @Issue("JIRA-14892")
    public void shouldFindServiceUsingSearch() {

        String expectedServiceName = "Внесення змін про ФОП";

        HomePage homePage = new HomePage(getDriver());
        homePage.searchService(expectedServiceName);

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.openServiceFromSearchResult(expectedServiceName);

        ServicePage servicePage = new ServicePage(getDriver());
        String actualServiceName = servicePage.getTitleOfService();
        Assert.assertEquals(actualServiceName, expectedServiceName);
    }
}

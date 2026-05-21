package AQALesson6.categoriestest;

import AQALesson6.basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.QALightCourse.AQALesson6.pages.CategoryProductsPage;
import ua.QALightCourse.AQALesson6.pages.CategoryPage;
import ua.QALightCourse.AQALesson6.pages.HomePage;
import ua.QALightCourse.AQALesson6.pages.ProductPage;

public class CategoryNavigationPositiveTest extends BaseTest {

    @Test
    public void shouldFindProductFromCategory() {
        String categoriesSelection = "Авто і Мото";
        String subCategory = "Мотошини";
        String product = "Pirelli Angel GT (180/55R17 73W)";

        HomePage homePage = new HomePage(driver);
        homePage.openCategoryFromIcons(categoriesSelection);

        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.selectSubCategory(subCategory);

        CategoryProductsPage categoryProductsPage = new CategoryProductsPage(driver);
        categoryProductsPage.openProduct(product);

        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.getProductTitle().contains(product));
    }
}

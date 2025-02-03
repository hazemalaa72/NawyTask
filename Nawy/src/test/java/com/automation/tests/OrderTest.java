package com.automation.tests;
import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import org.junit.jupiter.api.Test;
public class OrderTest extends BaseTest {
    @Test
    public void testCreateOrderForAppleMonitor() {
        HomePage homePage = new HomePage(page);
        ProductPage productPage = new ProductPage(page);
        homePage.navigateToProductPage();
        productPage.addAppleMonitorToCart();
    }
}
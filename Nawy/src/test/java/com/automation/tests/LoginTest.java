package com.automation.tests;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.junit.jupiter.api.Test;
public class LoginTest extends BaseTest {
    @Test
    public void testUserCanLogin() {
        HomePage homePage = new HomePage(page);
        LoginPage loginPage = new LoginPage(page);
        homePage.navigateToLogin();
        loginPage.login("testuser@example.com", "password123");
    }
}
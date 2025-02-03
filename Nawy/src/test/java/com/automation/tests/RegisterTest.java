package com.automation.tests;
import com.automation.pages.HomePage;
import com.automation.pages.RegisterPage;
import org.junit.jupiter.api.Test;
public class RegisterTest extends BaseTest {
    @Test
    public void testUserCanRegister() {
        HomePage homePage = new HomePage(page);
        RegisterPage registerPage = new RegisterPage(page);
        homePage.navigateToRegister();
        registerPage.register("testuser", "testuser@example.com", "password123");
    }
}

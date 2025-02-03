package com.automation.tests;
import com.automation.pages.LoginPage;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void testUserCanLogout() {
        LoginPage loginPage = new LoginPage(page);
        loginPage.login("user@example.com", "password123");

        // Verify the user is logged in
        Assert.assertTrue(loginPage.isUserLoggedIn());

        // Perform logout
        loginPage.logout();

        // Verify the user is logged out
        Assert.assertTrue(loginPage.isUserLoggedOut());
    }
}
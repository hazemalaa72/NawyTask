package com.automation.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
public class LoginPage {
    private final Page page;
    private final Locator emailInput;
    private final Locator passwordInput;
    private final Locator loginButton;
    private final Locator logoutButton;
    private final Locator loginButtonAfterLogout;
    public LoginPage(Page page) {
        this.page = page;
        emailInput = page.locator("input[name='email']");
        passwordInput = page.locator("input[name='password']");
        loginButton = page.locator("text=Log in");
        logoutButton = page.locator("text=Log out");
        loginButtonAfterLogout = page.locator("text=Log in");
    }
    public void login(String email, String password) {
        emailInput.fill(email);
        passwordInput.fill(password);
        loginButton.click();
    }
    public void logout() {
        // Wait until the "Log out" button is visible (indicating the user is logged in)
        logoutButton.waitFor();

        // Click the "Log out" button
        logoutButton.click();

        // Wait for the "Log in" button to appear, indicating the user is logged out
        loginButtonAfterLogout.waitFor();
    }

    // Optional: Verify if the user is logged in by checking the presence of the "Log out" button
    public boolean isUserLoggedIn() {
        return logoutButton.isVisible();
    }

    // Optional: Verify if the user is logged out by checking the presence of the "Log in" button
    public boolean isUserLoggedOut() {
        return loginButtonAfterLogout.isVisible();
    }
}
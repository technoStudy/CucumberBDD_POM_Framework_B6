package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePOM {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement usernameInput;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboardText;

    private String username = "richfield.edu";
    private String password = "Richfield2020!";

    public void validateUserOnLoginPage() {
        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
    }

    public void userEnterAdminCredentials() {
        acceptCookiesButton.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void validateUserSuccessfullyLoggedIn() {
        wait.until(ExpectedConditions.visibilityOf(dashboardText));
        Assert.assertTrue(dashboardText.isDisplayed());
    }

}

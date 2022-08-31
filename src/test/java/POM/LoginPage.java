package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement dashboardText;

    private String username = "richfield.edu";
    private String password = "Richfield2020!";

}

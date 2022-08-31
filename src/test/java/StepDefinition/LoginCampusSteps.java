package StepDefinition;

import POM.LoginPage;
import io.cucumber.java.en.*;

public class LoginCampusSteps {

    LoginPage loginPage;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPage = new LoginPage();
        loginPage.validateUserOnLoginPage();
    }

    @When("User enter admin credentials")
    public void user_enter_admin_credentials() {
        loginPage = new LoginPage();
        loginPage.userEnterAdminCredentials();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        loginPage = new LoginPage();
        loginPage.validateUserSuccessfullyLoggedIn();
    }

}

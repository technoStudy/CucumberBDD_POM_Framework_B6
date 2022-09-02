package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class CountriesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Country")
    public void user_create_country() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCountriesPage();
        dialogContentElements.createCountry();
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dialogContentElements = new DialogContentElements();

        dialogContentElements.validateSuccessMessage();
    }

}

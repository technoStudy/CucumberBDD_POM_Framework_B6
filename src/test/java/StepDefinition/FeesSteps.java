package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.When;

public class FeesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Fee {string} and {string} and {string} and {string}")
    public void user_create_fee_and_and_and(String name, String code, String intCode, String priority) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.createFee(name, code, intCode, priority);
    }

    @When("User edit Fee {string} and change it to {string}")
    public void user_edit_fee_and_change_it_to(String existingFeeName, String newFeeName) throws InterruptedException {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.editFee(existingFeeName, newFeeName);
    }

    @When("User delete Fee {string}")
    public void user_delete_Fee(String feeName) throws InterruptedException {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.deleteFee(feeName);
    }


}

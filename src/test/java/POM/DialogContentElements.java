package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentElements extends BasePOM {

    public DialogContentElements() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement nameSearchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteSubmitButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//fuse-progress-bar//mat-progress-bar")
    private WebElement progressBar;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityInput;


    public void createCountry() {
        addButton.click();
        nameInput.sendKeys("HalitTestCountry999");
        codeInput.sendKeys("HTC999");
        saveButton.click();
    }

    public void validateSuccessMessage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("successfully"));
    }

    public void editCountry() {
        nameSearchInput.sendKeys("HalitTestCountry999");
        searchButton.click();
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys("HalitTestCountry923");
        saveButton.click();
    }

    public void deleteCountry() {
        nameSearchInput.sendKeys("HalitTestCountry923");
        searchButton.click();
        waitUntilVisibleAndClickableThenClick(deleteButton);
        waitUntilVisibleAndClickableThenClick(deleteSubmitButton);
    }

    public void createCitizenship(String name, String shortName) {
        addButton.click();
        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortName);
        saveButton.click();
    }

    public void editCitizenship(String existingName, String newName) {
        nameSearchInput.sendKeys(existingName);
        searchButton.click();
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys(newName);
        saveButton.click();
    }

    public void deleteCitizenship(String citizenshipName) {
        nameSearchInput.sendKeys(citizenshipName);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        deleteButton.click();
        waitUntilVisibleAndClickableThenClick(deleteSubmitButton);
    }

    public void createFee(String name, String code, String intCode, String priority) {
        addButton.click();
        nameInput.sendKeys(name);
        codeInput.sendKeys(code);
        integrationCodeInput.sendKeys(intCode);
        priorityInput.sendKeys(priority);
        saveButton.click();
    }

    public void editFee(String existingName, String newName) throws InterruptedException {
        nameSearchInput.sendKeys(existingName);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys(newName);
        saveButton.click();
    }

    public void deleteFee(String feeName) throws InterruptedException {
        nameSearchInput.sendKeys(feeName);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        deleteButton.click();
        deleteSubmitButton.click();
    }

}

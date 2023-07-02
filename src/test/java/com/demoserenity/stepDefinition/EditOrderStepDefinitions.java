package com.demoserenity.stepDefinition;

import com.demoserenity.steps.DashBoardSteps;
import com.demoserenity.steps.EditOrderSteps;
import com.demoserenity.steps.LoginSteps;
import com.demoserenity.steps.OrderSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class EditOrderStepDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private DashBoardSteps dashBoardSteps;

    @Steps
    private OrderSteps orderSteps;

    @Steps
    EditOrderSteps editOrderSteps;

    @Given("the user is logged in to the application")
    public void theUserIsLoggedInToTheApplication() throws IOException {
        loginSteps.openLoginPage("https://demo.serenity.is/");
        loginSteps.sendCredentials();
        loginSteps.clickBtnSignIn();
    }

    @Given("the user clicks the More Info label in the Dashboard page")
    public void theUserClicksTheMoreInfoLabelInTheDashboardPage() {
        dashBoardSteps.clickLabelMoreInfo();
    }

    @When("the user is on the Order Details page")
    public void theUserIsOnTheOrderDetailsPage() {
        orderSteps.validateTitlePage();
    }

    @When("the user clicks on a customer's order")
    public void theUserClicksOnACustomerSOrder() {
        orderSteps.selectCustomer();
    }

    @When("the user navigates to the Edit Order page")
    public void theUserNavigatesToTheEditOrderPage() {
        editOrderSteps.validateEditOrderPageTitle();

    }

    @When("the user selects a random employee from the dropdown menu")
    public void theUserSelectsARandomEmployeeFromTheDropdownMenu() {
        editOrderSteps.selectEmployee();
    }

    @Then("the user clicks on the Apply Changes button")
    public void theUserClicksOnTheApplyChangesButton() {
        editOrderSteps.clickApplyChanges();
    }

    @Then("the user should see a confirmation message")
    public void theUserShouldSeeAConfirmationMessage() {
        editOrderSteps.validateSaveSuccess();
    }


}

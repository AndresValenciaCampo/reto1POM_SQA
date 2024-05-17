package com.demoserenity.stepDefinition;

import com.demoserenity.steps.DashBoardSteps;
import com.demoserenity.steps.EditOrderSteps;
import com.demoserenity.steps.LoginSteps;
import com.demoserenity.steps.OrderSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import java.io.IOException;

public class EditOrderStepDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private DashBoardSteps dashBoardSteps;

    @Steps
    private OrderSteps orderSteps;

    @Steps
    private EditOrderSteps editOrderSteps;


    @Given("the user is logged in")
    public void the_user_is_logged_in() throws IOException {
        loginSteps.openLoginPage("https://demo.serenity.is/");
        loginSteps.sendCredentials();
        loginSteps.clickBtnSignIn();

    }

    @When("the user clicks the More Info label from the DashBoard page")
    public void the_user_clicks_the_more_info_label_from_the_dash_board_page() {
        dashBoardSteps.clickLabelMoreInfo();
    }


    @When("the user navigates to the Order Details page and clicks on a customer's order")
    public void the_user_navigates_to_the_order_details_page_and_clicks_on_a_customer_s_order() {
        orderSteps.selectCustomer();
    }

    @When("the user navigates to the Edit Order page and selects a random employee from the dropdown menu")
    public void the_user_navigates_to_the_edit_order_page_and_selects_a_random_employee_from_the_dropdown_menu() {
        editOrderSteps.selectEmployee();
    }

    @When("the user clicks on the Save button")
    public void the_user_clicks_on_the_save_button() {
        editOrderSteps.clickApplyChanges();

    }

    @Then("the user should be redirected to the Orders page")
    public void the_user_should_be_redirected_to_the_orders_page() {
        editOrderSteps.validateSaveSuccess();

    }


}

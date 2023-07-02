package com.demoserenity.stepDefinition;

import com.demoserenity.steps.DashBoardSteps;
import com.demoserenity.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private DashBoardSteps dashBoardSteps;

    @Given("the user open the page demo serenity {string}")
    public void theUserOpenThePageDemoSerenity(String url) {
        loginSteps.openLoginPage(url);
    }

    @When("the user enters valid credentials and click Sign in")
    public void theUserEntersValidCredentialsAndClickSignIn() throws IOException {
        loginSteps.sendCredentials();
        loginSteps.clickBtnSignIn();
    }

    @Then("the user should see the message {string}")
    public void theUserShouldSeeTheMessage(String message) {

        dashBoardSteps.validateTitle(message);

    }

}

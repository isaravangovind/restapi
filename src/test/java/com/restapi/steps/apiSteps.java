package com.restapi.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class apiSteps {
    @Given("Send {string} Request with {string}")
    public void sendRequest(String method, String apiKey) {
            System.out.println("Test");
    }

    @When("Status Code is {string}")
    public void verifyStatusCode(String statusCode) {
            System.out.println("Test");
    }

    @Then("Validate PromoType is Should have be {string}")
    public void validatePromoType(String promoType) {
            System.out.println("Test");
    }
}

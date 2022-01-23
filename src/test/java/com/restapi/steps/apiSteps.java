package com.restapi.steps;


import com.rest.pojo.GetPromotions;
import com.restapi.utils.APIresources;
import com.restapi.utils.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class apiSteps extends utils {


    @Given("Send {string} Request with {string}")
    public void sendRequest(String method, String apiKey) {

        APIresources resource = APIresources.valueOf(method);
        System.out.println(resource.getResources());
//
//        GetPromotions pro = given().spec(reqSpec)
//                .when()
//                .get(resource.getResources())
//                .as(GetPromotions.class);

    }

    @When("Status Code is {string}")
    public void verifyStatusCode(String statusCode) {
            System.out.println(statusCode);
    }

    @Then("Validate PromoType is Should have be {string}")
    public void validatePromoType(String promoType) {
            System.out.println("Test");
    }
}

package com.restapi.steps;


import com.rest.pojo.GetPromotions;
import com.rest.pojo.Promotion;
import com.restapi.utils.APIresources;
import com.restapi.utils.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static io.restassured.RestAssured.*;

public class apiSteps extends utils {

    static GetPromotions promoResponse;

    @Given("Send {string} Request and Retrieve Response")
    public void sendRequest(String method) throws IOException {
        promoResponse = getResponse(method);

    }

    @When("Status Code is {string}")
    public void verifyStatusCode(String statusCode) {
        System.out.println(statusCode);
    }

    @Then("Validate PromoType is Should have be {string}")
    public void validatePromoType(String promoType) {
        Set<String> expectedPromoType = new HashSet<String>(Arrays.asList(promoType.split("/")));

        Set<String> actualPromoType = new HashSet<>();
        if (promoResponse.getPromotions() != null) {
            for (Promotion p : promoResponse.getPromotions()) {
                if (p.getPromoType() != null) {
                    actualPromoType.add(p.getPromoType());
                    System.out.println(actualPromoType);
                } else {
                    System.out.println("The Promotype is null ");
                }
            }

            for (String promosAct : actualPromoType) {
                for (String promoExp : expectedPromoType) {
                    Assert.assertTrue("Expected Promo Types are " + promoType + " But Actual Promo type Retrieved is " + promosAct,
                            promosAct.equalsIgnoreCase(promoExp));
                      /* if(promosAct.equalsIgnoreCase(promoExp))
                        {
                            System.out.println(promosAct + " equals to " + promoExp);
                        }
                       else {
                           System.out.println(promosAct + "  not equals to" + promoExp);

                       }*/

                }
            }
        } else {
            System.out.println("The response is null ");
            throw new NullPointerException("The Response is NULL");
        }


    }
}

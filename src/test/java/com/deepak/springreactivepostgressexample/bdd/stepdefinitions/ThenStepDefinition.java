package com.deepak.springreactivepostgressexample.bdd.stepdefinitions;

import com.deepak.springreactivepostgressexample.bdd.clients.ReactiveExampleClient;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ThenStepDefinition extends GenericSteps{
    public ThenStepDefinition(ReactiveExampleClient reactiveExampleClient) {
        super(reactiveExampleClient);
    }

    @Then("The endpoint responds with {string}")
    public void the_endpoint_responds_with(final String status) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("status="+ status);
    }


}

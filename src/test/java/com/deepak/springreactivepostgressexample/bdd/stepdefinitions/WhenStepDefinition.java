package com.deepak.springreactivepostgressexample.bdd.stepdefinitions;

import com.deepak.springreactivepostgressexample.bdd.clients.ReactiveExampleClient;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class WhenStepDefinition extends GenericSteps{
    public WhenStepDefinition(ReactiveExampleClient reactiveExampleClient) {
        super(reactiveExampleClient);
    }

    @When("I send a GET request for Health Endpoint")
    public void i_send_a_get_request_for_health_endpoint() {

        final Response response = reactiveExampleClient.getHealthEndpoint();
        System.out.println("response-->"+response);

    }


}

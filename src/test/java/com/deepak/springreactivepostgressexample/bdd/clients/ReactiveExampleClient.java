package com.deepak.springreactivepostgressexample.bdd.clients;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Slf4j
@Data
@Component
public class ReactiveExampleClient {


    private RequestSpecification getReactiveClient(){
        return given().baseUri("http://localhost:8080");
    }


    public Response getHealthEndpoint(){
        final String healthENdpoint = "/actuator/health";
        return getReactiveClient().basePath(healthENdpoint).get().prettyPeek();
    }
}

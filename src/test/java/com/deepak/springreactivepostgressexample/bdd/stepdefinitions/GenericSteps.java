package com.deepak.springreactivepostgressexample.bdd.stepdefinitions;


import com.deepak.springreactivepostgressexample.bdd.clients.ReactiveExampleClient;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.IOException;

@AllArgsConstructor
@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Testcontainers
public class GenericSteps {

    ReactiveExampleClient reactiveExampleClient;

    @Container
    private static final GenericContainer postGresContainer
            = new PostgreSQLContainer("postgres:9.6.12")
            .withDatabaseName("test")
            .withUsername("postgres")
            .withPassword("Pass2020!");

    @DynamicPropertySource
    static void setDynamicProps(DynamicPropertyRegistry registry) throws  InterruptedException, IOException{

        postGresContainer.start();

        System.out.println("DB contgainer starterd");

    }

}

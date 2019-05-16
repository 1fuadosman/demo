package com.demo.app.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class TestConfig {

    public static RequestSpecification JSONPlaceholder_requestSpec;
    public static ResponseSpecification responseSpec;

    @BeforeClass
    public static void setup() {

        JSONPlaceholder_requestSpec = new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com").
                addHeader("Content-Type", "application/json").
                addHeader("Accept", "application/json").
                build();

        RestAssured.requestSpecification = JSONPlaceholder_requestSpec;

        responseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                build();

        RestAssured.responseSpecification = responseSpec;

    }

}

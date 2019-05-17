package com.demo.app.tests;

import com.demo.app.config.EndPoint;
import com.demo.app.config.TestConfig;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class Comments extends TestConfig {

    @Test
    public void validEmailTest() {
        given().
                when().
                        get(EndPoint.COMMENTS + 1).
                then().
                        body("email", equalTo("Eliseo@gardner.biz"));
    }

    @Test
    public void invalidEmailTest() {
        given().
        when().
                get(EndPoint.COMMENTS + 1).
        then().
                body("email", not("invalid-email"));
    }

}

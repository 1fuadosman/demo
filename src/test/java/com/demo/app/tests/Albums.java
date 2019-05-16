package com.demo.app.tests;

import com.demo.app.config.EndPoint;
import com.demo.app.config.TestConfig;
import org.testng.annotations.Test;
import com.demo.app.config.TestConfig;

import static io.restassured.RestAssured.given;


public class Albums extends TestConfig {

    @Test
    public void getAllAlbums() {
        given().
        when().get(EndPoint.ALBUMS).
        then();
    }
}

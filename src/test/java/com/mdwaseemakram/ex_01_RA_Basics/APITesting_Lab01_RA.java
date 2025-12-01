package com.mdwaseemakram;

import io.restassured.RestAssured;

public class APITesting_Lab01_RA {
    public static void main(String[] args) {
        //https://restful-booker.herokuapp.com/ping
        //https://api.zippopotam.us/us/90210
        RestAssured.given()
                        .baseUri("https://restful-booker.herokuapp.com")
                        .basePath("/ping")
                .when()
                        .log().all().get()
                .then()
                        .log().all().statusCode(201);
    }
}

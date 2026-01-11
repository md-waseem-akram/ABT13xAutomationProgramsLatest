package com.mdwaseemakram.ex_03_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {
    String pincode;
    @Test
    //560016
    public void tc_01_valid_pincode(){
        pincode = "560016";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
    @Test
    //% Any special characters
    public void tc_02_Invalid_pincode(){
        pincode = "%";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }

    @Test
    // ' ' Blank
    public void tc_03_Invalid_pincode(){
        pincode = " ";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}

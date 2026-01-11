package com.mdwaseemakram.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_RA {
    public static void main(String[] args) {
        //https://api.zippopotam.us/us/90210
        //base uri -> https://api.zippopotam.us/us/
        //base path -> /IN/90210
        Scanner sc = new Scanner(System.in);
        String pincode = sc.next();

        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}

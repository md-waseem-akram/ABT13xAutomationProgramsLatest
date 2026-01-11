package com.mdwaseemakram.ex_05_TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_BeforeTest {
    @BeforeTest
    public void getToke(){
        System.out.println("This will run before actual test");
    }

    @Test
    public void PUT_Request(){
        System.out.println("This is actual put request");
    }

    @AfterTest
    public void closeAll(){
        System.out.println("After running acutal test this close all things");
    }
}

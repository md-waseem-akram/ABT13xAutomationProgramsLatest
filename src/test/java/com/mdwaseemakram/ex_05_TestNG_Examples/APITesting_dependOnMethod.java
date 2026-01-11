package com.mdwaseemakram.ex_05_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_dependOnMethod {
    @Test
    public void ServerStatusOK(){
        System.out.println("Server status ok 200");
//         Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "ServerStatusOK")
    public void Test1(){
        System.out.println("Test1 passed");
    }
    @Test(dependsOnMethods = "ServerStatusOK")
    public void Test2(){
        System.out.println("Test2 passed");
    }
}

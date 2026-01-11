package com.mdwaseemakram.ex_05_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Groups {
    @Test(groups = {"sanity", "regression"})
    public void Sanity(){
        System.out.println("sanity");
    }
    @Test(groups= {"smoke", "regression"})
    public void smoke(){
        System.out.println("smoke");
        Assert.assertTrue(true);
    }
    @Test(groups= {"regression"})
    public void regression(){
        System.out.println("regression");
    }
}

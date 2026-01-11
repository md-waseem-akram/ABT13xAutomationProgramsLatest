package com.mdwaseemakram.ex_05_TestNG_Examples;

import org.testng.annotations.Test;

public class APITesting_Priority {
    @Test(priority = 1)
    public void test1(){
        System.out.println("1");
    }
    @Test(priority = 2)
    public void test3(){
        System.out.println("2");
    }
    @Test(priority = 3)
    public void test2(){
        System.out.println("3");
    }
    @Test(priority =4)
    public void test4(){
        System.out.println("4");
    }
}

package test;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 {

//    @Parameters({"page"})
//    @Test
//    public void navigate_to_page(String page) {
//        System.out.println("navigate to :: "+page);
//    }

    @Parameters({"page"})
    @Test (dependsOnGroups = "login")
    public void Class_03_test_01(@Optional("default page") String page) {
        System.out.println("run test from :: "+page);
        System.out.println("class 03 test 01");
        Assert.assertTrue(true);
    }

    @Parameters({"page"})
    @Test (dependsOnGroups = "login")
    public void Class_03_test_02(@Optional("default page") String page) {
        System.out.println("run test from :: "+page);
        System.out.println("class 03 test 02");
        Assert.assertTrue(true);
    }

    @Parameters({"page"})
    @Test (dependsOnGroups = "login")
    public void Class_03_test_03(@Optional("default page") String page) {
        System.out.println("run test from :: "+page);
        System.out.println("class 03 test 03");
        Assert.assertTrue(true);
    }

    @Parameters({"page"})
    @Test (dependsOnGroups = "login")
    public void Class_03_test_04(@Optional("default page") String page) {
        System.out.println("run test from :: "+page);
        System.out.println("class 03 test 04");
        Assert.assertTrue(true);
    }
}

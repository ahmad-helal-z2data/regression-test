package test;

import data.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class class1 {

    @Test(dataProvider = "page-to-test", dataProviderClass= DataProviderClass.class)
    public void Class_01_test_01(String page) {
        System.out.println("run test multi time using data provider"+page);
        Assert.assertTrue(true);
    }

    @Test(dataProvider = "page-to-test", dataProviderClass= DataProviderClass.class)
    public void Class_01_test_02(String page) {
        System.out.println("run test multi time using data provider"+page);
        Assert.assertTrue(true);
    }

    @Test(dataProvider = "page-to-test", dataProviderClass= DataProviderClass.class)
    public void Class_01_test_03(String page) {
        System.out.println("run test multi time using data provider"+page);
        Assert.assertTrue(true);
    }

    @Test(dataProvider = "page-to-test", dataProviderClass= DataProviderClass.class)
    public void Class_01_test_04(String page) {
        System.out.println("run test multi time using data provider"+page);
        Assert.assertTrue(true);
    }

}

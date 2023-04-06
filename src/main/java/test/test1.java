package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        Assert.assertTrue(true);
    }

    @Test()
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test
    public void test4() {
        Assert.assertTrue(false);
        System.out.println(":::::::: test 1 ::::::::");
    }
}

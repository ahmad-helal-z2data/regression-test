package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
    @Test
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        Assert.assertTrue(true);
    }

    @Test
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test
    public void test4() {
        Assert.assertTrue(false);
        System.out.println(":::::::: test 2 ::::::::");
    }
}

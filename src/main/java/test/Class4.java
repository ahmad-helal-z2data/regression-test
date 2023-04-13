package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class4 {
    @Test
    public void Class4test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class4test2() {
        Assert.assertTrue(true);
    }

    @Test()
    public void Class4est3() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class4test4() {
        Assert.assertTrue(true);
//        System.out.println(":::::::: Failed Class4test4 ::::::::");
    }
}

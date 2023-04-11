package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class3 {
    @Test
    public void Class3test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class3test2() {
        Assert.assertTrue(true);
    }

    @Test()
    public void Class3est3() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class3test4() {
        Assert.assertTrue(true);
//        System.out.println(":::::::: Failed Class3test4 ::::::::");
    }
}

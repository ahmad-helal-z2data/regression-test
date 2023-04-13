package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class5 {
    @Test
    public void Class5test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class5test2() {
        Assert.assertTrue(true);
    }

    @Test()
    public void Class5est3() {
        Assert.assertTrue(true);
    }

    @Test()
    public void Class5test4() {
        Assert.assertTrue(true);
//        System.out.println(":::::::: Failed Class5test4 ::::::::");
    }
}

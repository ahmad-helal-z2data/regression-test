package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class6 {
    @Test
    public void Class6test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class6test2() {
        Assert.assertTrue(true);
    }

    @Test()
    public void Class6est3() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class6test4() {
        Assert.assertTrue(true);
//        System.out.println(":::::::: Failed Class5test4 ::::::::");
    }
}

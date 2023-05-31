package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class4 {
    @Test
    public void Class_04_test_01() {
        Assert.assertTrue(true);
        boolean bo = false;

    }

    @Test
    public void Class_04_test_02() {
        Assert.assertTrue(true);
    }

    @Test()
    public void Class_04_test_03() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class_04_test_04() {
        Assert.assertTrue(false);
    }
}

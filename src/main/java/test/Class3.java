package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class3 {
    @Test
    public void Class_03_test_01() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class_03_test_02() {
        Assert.assertTrue(true);
    }

    @Test()
    public void Class_03_test_03() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class_03_test_04() {
        Assert.assertTrue(false);
    }
}

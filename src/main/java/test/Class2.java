package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Class2 extends TestBase {
    @Test(groups = {"smoke"})
    public void Class_02_test_01() {
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"}, enabled = false)
    public void Class_02_test_02() {
        Assert.assertTrue(true);
    }

    @Test(dependsOnGroups = "smoke", groups = "smoke")
    public void Class_02_test_03() {
        Assert.assertTrue(true);
    }

    @Test
    public void Class_02_test_04() {
        Assert.assertTrue(false);
    }
}

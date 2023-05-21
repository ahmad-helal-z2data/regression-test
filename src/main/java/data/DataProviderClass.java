package data;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "page-to-test")
    public static Object [] [] dataProviderMethod () {

        return new Object[][] { { " first Object " }, { " second Object" } };
    }
}

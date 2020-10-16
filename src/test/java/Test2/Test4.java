package Test2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {

    @DataProvider(name = "SetEnvironment", parallel = true)

    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }


    @Test(dataProvider = "SetEnvironment")
    public void mtd4(String n, String p) {
        System.out.println(n+" "+p);

    }
}

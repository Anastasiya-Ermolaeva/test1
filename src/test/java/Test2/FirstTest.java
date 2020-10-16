package Test2;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FirstTest extends BaseTest {
    int pr=15;

    @Test
    public void mtd(){
        Assertion a = new Assertion();
        boolean result = pr>7;
        a.assertTrue(result);
        System.out.println(result);

    };
}

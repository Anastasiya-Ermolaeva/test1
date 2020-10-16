package Test2;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void mtd3 (String n, String p) {
        System.out.println(n);
        System.out.println(p);

    }
}

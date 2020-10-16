package TestFile;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFile extends BaseTestFile{
    String str="Программа";

    @Test
    public void check_file() {

        Assertion a = new Assertion();
        boolean result = str.contains(content);
        a.assertTrue(result);
        System.out.println(result);

    }
}

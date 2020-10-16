package TestFile;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.*;




public class BaseTestFile {
    String content;

    @BeforeTest
    public void file() {
        try {
            DataInputStream reader = new DataInputStream(new FileInputStream("C:\\Users\\Техносила\\Desktop\\file.txt"));
            byte[] d = new byte[reader.available()];
            reader.readFully(d);
            reader.close();
            content = new String(d, 0, d.length);
            System.out.println(content);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
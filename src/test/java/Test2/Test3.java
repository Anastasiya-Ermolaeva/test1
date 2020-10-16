package Test2;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")

    public void mtd3 (String n, String p) {
        System.out.println(n);
        System.out.println(p);

    }
}

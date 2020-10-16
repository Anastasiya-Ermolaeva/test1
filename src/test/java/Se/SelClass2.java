package Se;

import PageObject.UnitPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class SelClass2 extends SelClass{

    @Test

    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")
    
    public void metod(){

        //getDriver().get("https://www.google.ru/");
        getDriver().get("https://www.elibrary.ru/");
        getDriver().manage().window().maximize();
        UnitPage in = new UnitPage (getDriver());
        in.setSearchText("Информатика");
        in.clickSubmitSearch();

    }

}

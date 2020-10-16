package Se;

import PageObject.UnitPage;
import org.testng.annotations.Test;

public class SelClass2 extends SelClass{

    @Test
    public void metod(){

        //getDriver().get("https://www.google.ru/");
        getDriver().get("https://www.elibrary.ru/");
        getDriver().manage().window().maximize();
        UnitPage in = new UnitPage (getDriver());
        in.setSearchText("Информатика");
        in.clickSubmitSearch();

    }

}

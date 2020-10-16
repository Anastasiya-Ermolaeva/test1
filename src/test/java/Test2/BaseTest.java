package Test2;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void metod(){
        System.out.println("Перед тестом");

    }
    @AfterTest
    public void metod1(){
        System.out.println("После теста");

    }
    @BeforeMethod
    public void metod2(){
        System.out.println("Действие перед методом");

    }
    @AfterMethod
    public void metod3(){
        System.out.println("Действие после метода");

    }
}

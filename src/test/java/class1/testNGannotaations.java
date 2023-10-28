package class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testNGannotaations {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am before method");
    }

    @Test
    public void aTestCase() {
        System.out.println("I am the first test case");
    }

    @Test
    public void bTestCase() {
        System.out.println("I am the second test case");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
}

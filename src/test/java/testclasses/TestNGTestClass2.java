package testclasses;

import org.testng.annotations.*;

public class TestNGTestClass2 {

    @BeforeClass
    public void setup()
    {
        System.out.println("It runs once before class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("This runs before every method");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("This runs after every method");
    }

    @AfterClass
    public void cleanup()
    {
        System.out.println("It runs once after class");
    }

    @Test
    public void f1()
    {
        System.out.println("In method f1");
    }

}

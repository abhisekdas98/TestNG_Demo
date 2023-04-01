package testclasses;

import org.testng.annotations.*;

public class TestNG_BeforeClassAnnotation {

    @BeforeClass
    public void setup()
    {
        System.out.println("It runs once before class");
    }

    @AfterClass
    public void cleanup()
    {
        System.out.println("It runs once after class");
    }
    @Test
    public void testMethod1()
    {
         System.out.println("Running Test-------> testMethod1");
    }
    @Test
    public void testMethod2()
    {
        System.out.println("Running Test-------> testMethod2");
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
}

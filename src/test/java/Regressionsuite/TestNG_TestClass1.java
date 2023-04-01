package Regressionsuite;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass1 extends BaseTestSuite {

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
}

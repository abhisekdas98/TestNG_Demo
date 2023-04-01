package Regressionsuite;

import base.BaseTestSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNG_TestClass2 extends BaseTestSuite {

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

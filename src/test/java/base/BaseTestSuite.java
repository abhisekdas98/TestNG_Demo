package base;

import org.testng.annotations.*;

public class BaseTestSuite {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("BaseTestSuite -----> before suite");
    }
    @BeforeClass
    public void setup()
    {
        System.out.println("BaseTestSuite -----> before class");
    }

    @AfterClass
    public void cleanup()
    {
        System.out.println("BaseTestSuite -----> after class");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("BaseTestSuite -----> Aftersuite");
    }
}

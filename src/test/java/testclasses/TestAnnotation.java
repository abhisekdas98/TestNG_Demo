package testclasses;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAnnotation {
    @Test
    public void testMethod1()
    {
        SoftAssert sa=new SoftAssert();
        SomeClassToTest obj1=new SomeClassToTest();
        int result=obj1.sumNumbers(10,11);
        //Assert.assertEquals(result,21);
        sa.assertEquals(result,21);
        System.out.println("Executed assert 1");
        sa.assertEquals(result,22);
        System.out.println("Executed assert 2");
        sa.assertEquals(result,23);
        System.out.println("Executed assert 3");
        sa.assertAll();
       System.out.println("Running Test ----> Method 1");

    }

    @Test
    public void testMethod2()
    {
        SomeClassToTest obj1=new SomeClassToTest();
        String  result=obj1.addStrings("Hello","World");
        Assert.assertEquals(result,"Hello World");
        System.out.println("Running Test ----> Method 2");

    }

    @Test
    public void testMethod3()
    {
        SomeClassToTest obj1=new SomeClassToTest();
        int []result=obj1.getArray();
        Assert.assertEquals(result,new int[]{1,2,3});
        System.out.println("Running Test ----> Method 3");

    }
}

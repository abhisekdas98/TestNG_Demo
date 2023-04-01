package testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders {

    @DataProvider(name="inputs")
    public Object[][] getdata()
    {
         return new Object[][]{
                 {"bmw","m3"},
                 {"audi" , "a6"},
                 {"benz","c3100"}
         };
    }

    @Test(dataProvider = "inputs",dataProviderClass = TestNG_DataProviders.class)
    public void testmethod(String str1,String str2)
    {
       System.out.println("Input 1: "+str1);
        System.out.println("Input 2: "+str2);

    }
}

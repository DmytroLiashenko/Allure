package data;

import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class DataTest {
    @DataProvider
    public static Object[][] getCert(){
        return new Object[][]{
                {"45924126","true"},
                {"111111111","false"},
                {"70240235","true"},

        };
    }
    @DataProvider
    public static Object[][] getSearchVariant(){
        return new Object[][]{
                {"QA", Arrays.asList("QA Manual","QA Automation — Java","QA Technical Pro")},
                {"Python",Arrays.asList("Python Basic","Python Pro","QA Automation — Python")}
        };
    }
}

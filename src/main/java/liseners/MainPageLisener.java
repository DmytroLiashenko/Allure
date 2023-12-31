package liseners;

import config.BaseClass;
import org.openqa.selenium.By;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.ScreenShoT;

public class MainPageLisener extends BaseClass implements ITestListener  {

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShoT.getScreenShot( result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if(result.getMethod().getMethodName().equals("Test2CheckCert")){
            ScreenShoT.getWebElementPNG(driver.findElement(By.id("certificateImageContainer"))
                    ,result.getTestName());
        }
    }
}
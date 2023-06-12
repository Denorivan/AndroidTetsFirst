import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.restassured.RestAssured;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected AppiumDriver<?> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        if (Constants.REMOTE_RUN){


            driver = new AndroidDriver<>(new URL(Constants.REMOTE_URL), Config.getRemoteDesiredCapabilities());
        } else {
             driver = new AndroidDriver<>(Config.getURL(), Config.getDesiredCapabilities());
        }


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
/*
    @AfterMethod
    public void teardown(ITestResult result) {
        if(Constants.REMOTE_RUN) {
            String status = result.isSuccess() ? "passed" : "failed";
            driver.executeScript("sauce:job-result=" + status);
        }
    }*/



}

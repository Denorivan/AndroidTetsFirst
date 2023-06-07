import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class BaseTest {
    protected AppiumDriver<?> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        driver = new AndroidDriver<>(Config.getURL(), Config.getDesiredCapabilities());
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

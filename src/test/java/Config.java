import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static URL getURL() throws MalformedURLException {

        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    public static URL getRemoteURL() throws MalformedURLException {

        return new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
    }

    public static DesiredCapabilities getDesiredCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("DEVICE_NAME", "Pixel 2 API 33");
        desiredCapabilities.setCapability("APP", System.getProperty("user.dir") + "/" +"src/test/resources/Google_Calculator_8.4 (503542421)_apkcombo.com.apk");
        desiredCapabilities.setCapability("platformName", "Android");
        return desiredCapabilities;
    }

    public static DesiredCapabilities getRemoteDesiredCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        desiredCapabilities.setCapability("appium:app", "storage:filename=Google_Calculator_8.4 (503542421)_apkcombo.com.apk");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceOrientation", "portrait");
        desiredCapabilities.setCapability("appium:platformVersion", "13.0");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        MutableCapabilities sauceOptions = new MutableCapabilities();

        sauceOptions.setCapability("username", "oauth-vsevolod.krasnikov-51ae8");
        sauceOptions.setCapability("accessKey", "6658d313-9849-4bd2-b1a7-eef14d30d4fb");
        sauceOptions.setCapability("build", "<selenium-build-SKFYY>");
        sauceOptions.setCapability("name", "<First android test>");
        desiredCapabilities.setCapability("sauce:options", sauceOptions);
        return desiredCapabilities;
    }

}

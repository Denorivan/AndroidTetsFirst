import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static URL getURL() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    public static DesiredCapabilities getDesiredCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("DEVICE_NAME", "Pixel 2 API 33");
        desiredCapabilities.setCapability("APP", "G:\\AndroidTest\\AndroidTetsFirst\\src\\test\\resources\\Google_Calculator_8.4 (503542421)_apkcombo.com.apk");
        desiredCapabilities.setCapability("platformName", "Android");
        return desiredCapabilities;
    }
}

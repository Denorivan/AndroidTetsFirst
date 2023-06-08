public class Constants {
    public static Boolean REMOTE_RUN = Boolean.parseBoolean(System.getProperty("REMOTE_RUN", "true"));

    public static String LOCAL_URL = "http://127.0.0.1:4723/wd/hub";

    public static String REMOTE_URL = "https://ondemand.eu-central-1.saucelabs.com:443/wd/hub";


}

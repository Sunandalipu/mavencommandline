package aws;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTest {

	public static void main(String[] args) throws MalformedURLException {
	URL	url= new URL ("http://54.196.234.123:7777/wd/hub");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver= new RemoteWebDriver(url, cap);
	driver.get("https://gmail.com");

	}

}

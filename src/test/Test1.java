package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void t1() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.21.36.31:4444"),caps);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
}
}

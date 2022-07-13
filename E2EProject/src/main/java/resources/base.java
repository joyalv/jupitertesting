package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class base {

	public WebDriver driver;

	@BeforeMethod
	public WebDriver initialiseDriver() throws IOException {

		Properties prop = new Properties();
		String userDirectory = System.getProperty("user.dir");

		FileInputStream fis = new FileInputStream(userDirectory + "//src//main//java//resources//data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/786934/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://jupiter.cloud.planittesting.com");

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

	@AfterMethod
	public void closeDriver() {
		driver.close();

	}

}
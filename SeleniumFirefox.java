import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}



	@Test
	public void test() {
		driver.get("http://www.mahsumakbas.net/");

		String element = driver.findElement(By.xpath("//a[@class='site-description']")).getText();

		System.out.println("Page title is: " + driver.getTitle());

		System.out.println("Site Description is: " + element);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}

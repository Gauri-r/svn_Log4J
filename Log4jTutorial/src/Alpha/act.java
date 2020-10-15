package Alpha;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class act {
	private static Logger log=LogManager.getLogger(Log4jDemo.class.getName());
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 8);
		driver.get("https://www.amazon.in/");
		log.info("Successfully Opened Amazon.in");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Best Sellers')]")));
		//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		
		
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
			log.info("Best Sellers Link Clicked Succesfully");
			driver.findElement(By.xpath("//img[contains(@alt,'The Power of your Subconscious Mind')]")).click();
			log.info("Book Selected Succesfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(" NOT EXECUTED ");
		}
		
	
		}


	
}

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ElementNotInteractableException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class Tipo_waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\edgedriver\\msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		
		//Implicit wait
		//driver_edge.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver_edge.get("https://www.google.com");
		//driver_edge.findElement(By.className("Gdd5U1"));
		
		//explicit wait
		//driver_edge.get("https://www.google.com");
		//WebElement image = driver_edge.findElement(By.className("gLFyf"));
		//Wait<WebDriver> wait = new WebDriverWait(driver_edge, Duration.ofSeconds(5));
		//wait.until(imageshow -> image.isDisplayed());
		//driver_edge.findElement(By.className("gLFyf")).sendKeys("selenium");
		
		//fluent wait
		driver_edge.get("https://www.google.com");
		WebElement image = driver_edge.findElement(By.className("gLFyf"));
		Wait<WebDriver> wait = new FluentWait<>(driver_edge)
				.withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(ElementNotInteractableException.class);
		wait.until(d-> {
			image.sendKeys("selenium");
			return true;
		});
	
		
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;
import org.openqa.*;

public class manejo_de_iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.linkText("CSS Tutorial")).click();
		driver.switchTo().defaultContent();
	}
}


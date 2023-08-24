import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class interacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\edgedriver\\msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com");
		//send keys 
		driver_edge.findElement(By.id("twotabsearchtextbox")).sendKeys("nintendo switch");
	    //driver_edge.findElement(By.id("nav-search-submit-button")).click();
		//clear
		driver_edge.findElement(By.id("twotabsearchtextbox")).clear();
		//click()
		driver_edge.findElement(By.id("nav-hamburger-menu")).click();
		//submit() ya no es valido
	}

}

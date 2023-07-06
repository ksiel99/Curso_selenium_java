import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class localizadores_amigables {

	public static void main(String[] args) {
		//edge
		  System.setProperty("webdriver.edge.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\edgedriver\\msedgedriver.exe");
		  WebDriver driver_edge = new EdgeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_edge.get("https://www.google.com");
		 // driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_v"))).click();
		  driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_d")).toRightOf(By.className("gb_v"))).click();
		  
		//chrome
		  
		//firefox  
	}

}

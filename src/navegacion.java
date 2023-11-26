import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class navegacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\edgedriver\\msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com");
		//ir a 
		driver_edge.navigate().to("https://www.youtube.com/channel/UCcT6IFddIod7xURc7a7q3Bg");
		//regra a
		driver_edge.navigate().back();
		// adelante a
		driver_edge.navigate().forward();
		//actualizar
		driver_edge.navigate().refresh();
	}

}

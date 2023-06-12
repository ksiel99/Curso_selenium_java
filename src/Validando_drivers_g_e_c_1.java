import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validando_drivers_g_e_c_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// validando chrome driver
		  System.setProperty("webdriver.Chrome.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\chromedrvier\\chromedriver.exe");
		  WebDriver driver_chrome = new ChromeDriver();
		  driver_chrome.get("https://www.google.com");
		
		//validando geckodrive
		  
	   //validando edgedriver  
		  
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class metodos_basicos_selenium {

	public static void main(String[] args) {
		  System.setProperty("webdriver.Chrome.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\chromedrvier\\chromedriver.exe");
		  WebDriver driver_chrome = new ChromeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_chrome.get("https://www.google.com");
		  //metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		  System.out.println(driver_chrome.getTitle());
		  //metodo basico 3, getCurrentUrl() muestra la direccion actual de la pagina
		  System.out.println(driver_chrome.getCurrentUrl());
		  //metodo basico 4, .close() = cierra el navegador
		  driver_chrome.close();
		  //metodo basico 5, .quit() = termina la sesion del driver 
		  driver_chrome.quit();
		  
		  //edge
		  
		  
		  //firefox
		  
	}

}

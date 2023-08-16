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
		  System.setProperty("webdriver.edge.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\edgedriver\\msedgedriver.exe");
		  WebDriver driver_edge = new EdgeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_edge.get("https://www.google.com");
		  //metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		  System.out.println(driver_edge.getTitle());
		  //metodo basico 3, getCurrentUrl() muestra la direccion actual de la pagina
		  System.out.println(driver_edge.getCurrentUrl());
		  //metodo basico 4, .close() = cierra el navegador
		  driver_edge.close();
		  //metodo basico 5, .quit() = termina la sesion del driver 
		  driver_edge.quit();
		  
		  //firefox
		  System.setProperty("webdriver.gecko.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\geckodriver\\geckodriver.exe");
		  WebDriver driver_firefox = new FirefoxDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_firefox.get("https://www.google.com");
		  //metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		  System.out.println(driver_firefox.getTitle());
		  //metodo basico 3, getCurrentUrl() muestra la direccion actual de la pagina
		  System.out.println(driver_firefox.getCurrentUrl());
		  //metodo basico 4, .close() = cierra el navegador
		  driver_firefox.close();
		  //metodo basico 5, .quit() = termina la sesion del driver 
		  driver_firefox.quit();
	}

}
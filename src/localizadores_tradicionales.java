import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class localizadores_tradicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//edge
		  System.setProperty("webdriver.edge.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\edgedriver\\msedgedriver.exe");
		  WebDriver driver_edge = new EdgeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_edge.get("https://www.google.com");
		  //encontrando elemento por id
		  driver_edge.findElement(By.id("APjFqb"));
		  //encontrar elemento por classname
		  driver_edge.findElement(By.className("gNO89b"));
		  //encontrar elemento por name
		  driver_edge.findElement(By.name("btnI"));
		  //encontrar elemento por link text
		  driver_edge.findElement(By.linkText("Sobre Google"));
		  //encontrar elemento por link text parcial
		  driver_edge.findElement(By.partialLinkText("Sobre"));
		  //encontrar elemento por xpath
		  driver_edge.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[2]"));
		  
		  //metodo basico 5, .quit() = termina la sesion del driver 
		  driver_edge.quit();
		//firefox
		  
		//chrome  
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class obtener_informacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\edgedriver\\msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com");
		
		//regresa un valor booleano si el elemento se a mostrado
		boolean deliverivisible = driver_edge.findElement(By.id("glow-ingress-line1")).isDisplayed();
		System.out.println(deliverivisible);
		
		//regresa un valor booleano si el elemento esta disponible 
		boolean searchbox = driver_edge.findElement(By.id("twotabsearchtextbox")).isEnabled();
		System.out.println(searchbox);
		
		//regresa verdadero o falso si se selecciono el checkbox. input, radio button, etc
		driver_edge.findElement(By.id("icp-nav-flyout")).click();
		driver_edge.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i")).click();
		boolean lenseleccionado = driver_edge.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/input")).isSelected();
		System.out.println(lenseleccionado);
		
		//regresa el tagname del element. input, spam, div, i , etc
		String nametag = driver_edge.findElement(By.id("twotabsearchtextbox")).getTagName();
		System.out.println(nametag);
		
		// obtener ubicacion y tamaño de los componentes en pantalla
		Rectangle imgamazon = driver_edge.findElement(By.id("nav-logo-sprites")).getRect();
		System.out.println(imgamazon.getX());
		System.out.println(imgamazon.getY());
		System.out.println(imgamazon.getWidth());
		System.out.println(imgamazon.getHeight());
		
		//regresa los valores Css
		String valorcss = driver_edge.findElement(By.className("a-button-inner")).getCssValue("border-radius");
		System.out.println(valorcss);
		
		//regresa el texto del componente
		String texto = driver_edge.findElement(By.id("icp-language-translation-text")).getText();
		System.out.println(texto);
		
		
	}

}

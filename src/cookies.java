import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;

import org.openqa.*;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com.mx");
		
		// obtener cookie por nombre
		Cookie cookie1 = driver.manage().getCookieNamed("OGPC");
		System.out.println(cookie1);
		
		//obtener todas cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies);
		
		//eliminar cookie
		driver.manage().deleteCookie(cookie1);
		
		//eliminar todas las cookies
		driver.manage().deleteAllCookies();
	}

}

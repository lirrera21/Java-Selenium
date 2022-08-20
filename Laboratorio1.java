package Edit.EducacionIT;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Laboratorio1 {
	/*Metodo para abrir la pagina de Selenium.dev bajo Chrome
	 */
	@Test
	public void abrirPaginaEnChrome() {
		// 1.Indicar donde esta nuestro driver
		System.setProperty("webdriver.chrome.driver", "..\\EducacionIt\\Drivers\\chromedriver.exe");	
		// 2.Crear el objeto segun el navegador
		WebDriver driver = new ChromeDriver();		
		// 3.Abrir la pagina de Selenium.dev
		driver.get("https://www.selenium.dev/");
		// 4.Maximizar la pagina
		driver.manage().window().maximize();
		// 5. Imprimir en la consola el titulo de la pagina
		System.out.println(driver.getTitle());
		// 6. Cerrar el pagina
		driver.close();
	}
	
	@Test
	public void abrirPaginaEnFireFox() {
		// 1.Indicar donde esta nuestro driver
		System.setProperty("webdriver.gecko.driver", "..\\EducacionIt\\Drivers\\geckodriver.exe");	
		// 2.Crear el objeto segun el navegador
		WebDriver driver = new FirefoxDriver();		
		// 3.Abrir la pagina de Selenium.dev
		driver.get("https://www.selenium.dev/");
		// 4.Maximizar la pagina
		driver.manage().window().maximize();
		// 5. Imprimir en la consola el titulo de la pagina
		System.out.println(driver.getTitle());
		// 6. Cerrar el pagina
		driver.close();
	}
	/*Metodo para abrir la pagina de Selenium.dev bajo Chrome y hacer una busqueda
	 */
	@Test
	public void buscarPalabraEnChrome() {
		// 1.Indicar donde esta nuestro driver
		System.setProperty("webdriver.chrome.driver", "..\\EducacionIt\\Drivers\\chromedriver.exe");	
		// 2.Crear el objeto segun el navegador
		WebDriver driver = new ChromeDriver();		
		// 3.Abrir la pagina de Selenium.dev
		driver.get("https://www.selenium.dev/");
		// 4.Maximizar la pagina
		driver.manage().window().maximize();
		// 5. Hacer una busqueda de una palabra y presionar la tacla ENTER
		WebElement txtSearch = driver.findElement(By.id("gsc-i-id1"));
		txtSearch.sendKeys("java");
		txtSearch.sendKeys(Keys.ENTER);
		// 6. Cerrar el pagina
				driver.close();
	}
}

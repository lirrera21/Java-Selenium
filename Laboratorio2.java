package Edit.EducacionIT;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Laboratorio2 {
	String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account\r\n";

	/* Método para crear una cuenta en AutomatitionPractice
	 * 
	 */
	@Test
	public void registrarUsuario() {
		
	// Establecer el navegador a utilizar
		System.setProperty("webdriver.chrome.driver", "..\\EducacionIt\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	//Escribir el correo y hacer click en el bóton
		WebElement txtEmail = driver.findElement(By.id("email_create"));
		txtEmail.sendKeys("correo5006@mailinator.com");
		// hacer click
		driver.findElement(By.id("SubmitCreate")).click();
		
	//Introducir una espera
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='id_gender1']")));
	//Radio boton de genero	
		WebElement radGender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		radGender.click();
	//Completar campos de datos
		driver.findElement(By.name("customer_firstname")).sendKeys("Juan");
		//busco con css
		driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Perez");
		
	// Completar Password
		WebElement txtPassword = driver.findElement(By.id("passwd"));
		txtPassword.sendKeys("12345678");
		
	//Completar la fecha de nacimiento campos desplegables
		Select days = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		days.selectByValue("26");
		
		Select months = new Select(driver.findElement(By.cssSelector("#months")));
		months.selectByValue("6");
		
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue ("2000");
	// hacer click en checkbox
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();	
		
	//Completar mas campos de datos
		driver.findElement(By.id("company")).sendKeys("DC");
		//pero con id name
		//driver.findElement(By.name("company")).sendKeys("MARVEL");
		driver.findElement(By.cssSelector("#address1")).sendKeys("MiCalle"); 
		driver.findElement(By.cssSelector("#address2")).sendKeys("Entrecalles");
		driver.findElement(By.id("city")).sendKeys("baries");
		driver.findElement(By.id("postcode")).sendKeys("00005");
	
	//Completar de una lista State
		Select state = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		// otro para usar Select states = new Select (driver.findElement(By.id("id_state")));
		state.selectByValue("1"); 
		
	//Completar otra lista desplegable
		
		//Select countries = new Select(driver.findElement(By.cssSelector("#id_country");
		Select countries = new Select(driver.findElement(By.id("id_country")));
		countries.selectByValue("21");
		
	//Completar un text-area se completa igual que campo de texto
		driver.findElement(By.id("other")).sendKeys("Completando text box");
		
	//Completo campos de telefono
		driver.findElement(By.name("phone")).sendKeys("123-3456");
		driver.findElement(By.id("phone_mobile")).sendKeys("15678678667");
	//El formulario por defecto trae un texto hay que hacer un .clear antes de escribir
		WebElement txtAlias = driver.findElement(By.id("alias"));
		txtAlias.clear();
		txtAlias.sendKeys("Mi Oficce");
		
	//Hacer click en el boton Register
		driver.findElement(By.cssSelector("#submitAccount")).click();
		
		
	//cerrar
		//driver.close();
		
		
	

	
		
	
}
}

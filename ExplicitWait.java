package tupaquete;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AppTest {
  
  protected WebDriver driver;
  @Test
  public void tutorialselenium() throws InterruptedException 
  {
  System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
  driver = new ChromeDriver(); 
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
  String Titulo = "Google";
  String aTitulo = "" ;
  // Lanzar Chrome y redirecciona a la base URL
  driver.get("http://www.google.com" );
  //Maximizar la ventana del navegador
  driver.manage().window().maximize() ;
  //Obtiene el valor actual del titulo
  aTitulo = driver.getTitle();
  //Compara el titulo actual con el titulo esperado
  if (aTitulo.equals(Titulo))
  {
  System.out.println( "La prueba ha pasado") ;
  }
  else {
  System.out.println( "La prueba ha fallado" );
  }
        WebElement txtGoogle;
  txtGoogle= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( "lst-ib")));
  txtGoogle.sendKeys("tutorial selenium");
}
}
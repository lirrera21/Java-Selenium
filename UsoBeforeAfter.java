package junitpack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class junittest2 {
 private static WebDriver driver = null;
  
@Before
public void openbrowser() {
 System.out.print("\nBrowser open");
 // set geckodriver path.
 System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
 //initialize firefox driver.
 driver = new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
}

@After
public void closebrowser() {
 System.out.print("\nBrowser close");
 driver.quit();
}
 
 @Test
 public void test1() throws InterruptedException{  
 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest2 class-test1");
 System.out.print("\njunittest2 class-test1 method is executed");
 Thread.sleep(2000);
 }

 @Test
 public void test2() throws InterruptedException {
 driver.findElement(By.xpath("//input[@name='fname']")).clear();
 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest2 class-test2");
 Thread.sleep(2000);
 System.out.print("\njunittest2 class-test2 method is executed");
 }
}
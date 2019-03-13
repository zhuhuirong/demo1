package b;

import org.junit.After;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c
{
	WebDriver driver;
	@Before
	public void zhuce()
	{
		System.setProperty("webdriver.firefox.bin","D:\\软件\\firefox.exe");
	    driver=new FirefoxDriver();
	    String url="http://localhost:8080/mobile_mysql/index.jsp";
	    driver.get(url);
	   
	}
	@Test
	public void zhuce1() throws InterruptedException
	{
		driver.findElement(By.linkText("注册")).click();
		driver.findElement(By.name("name")).sendKeys("xiaoming");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("passwordOne")).sendKeys("123");
		driver.findElement(By.name("reallyName")).sendKeys("朱晖荣");
		driver.findElement(By.name("age")).sendKeys("19");
		driver.findElement(By.name("profession")).sendKeys("学生");
		driver.findElement(By.name("email")).sendKeys("999999999@qq.com");
		driver.findElement(By.name("question")).sendKeys("你最近好吗");
		driver.findElement(By.name("result")).sendKeys("挺好的");
		driver.findElement(By.className("input1")).click();
		Thread.sleep(5000);
	}
	@After
	public void denglu()
	{
		
		driver.findElement(By.name("name")).sendKeys("xiaoming");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.className("input1")).click();
	}
	
}
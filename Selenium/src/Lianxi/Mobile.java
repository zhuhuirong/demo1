package Lianxi;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {
	@Test
	public void openfirefox()
	{
		//��������
	  
		System.setProperty("webdriver.firefox.bin","D:\\���\\firefox.exe");
	    WebDriver driver=new FirefoxDriver();
	   
		//�ȸ������
	  /*System.setProperty("Webdriver.chrome.driver",".//Tools//chromedriver.exe");
	   *WebDriver driver=new ChromeDriver();
	   */
	   String url="http://localhost:8080/mobile_mysql/index.jsp";
	   driver.get(url);
	   String a=driver.getTitle();
	   System.out.println(a);
	   String b=driver.getCurrentUrl();
	   System.out.println(b);
	   driver.manage().window().maximize();
	 /*String url1="http://localhost:8080/mobile_mysql/bg-land.jsp";
	   driver.get(url1);
	   driver.navigate().back();
	   driver.navigate().forward();*/
	   
	}

}

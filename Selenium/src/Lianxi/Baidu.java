package Lianxi;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baidu {
	@Test
	public void openfirefox()
	{
		//»ðºüä¯ÀÀÆ÷
	  
		System.setProperty("webdriver.firefox.bin","D:\\Èí¼þ\\firefox.exe");
	    WebDriver driver=new FirefoxDriver();
	   
		//¹È¸èä¯ÀÀÆ÷
		/*System.setProperty("Webdriver.chrome.driver",".//Tools//chromedriver.exe");
		*WebDriver driver=new ChromeDriver();
		*/
	   String url="https://www.baidu.com";
	   driver.get(url);
	   String a=driver.getTitle();
	   System.out.println(a);
	   String b=driver.getCurrentUrl();
	   System.out.println(b);
	   driver.manage().window().maximize();
	   String url1="https://www.sina.com";
	   driver.get(url1);
	   driver.navigate().back();
	   driver.navigate().forward();
	   
	}

}
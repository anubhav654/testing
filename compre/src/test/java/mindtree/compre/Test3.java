package mindtree.compre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	    public static void test3()
	    {
	      System.setProperty("webdriver.gecko.driver", "C:\\Users\\mindsdet300\\Downloads\\geckodriver.exe");
	      WebDriver dr=new FirefoxDriver();
	      dr.get("https://www.urbanladder.com");
	      dr.findElement(By.xpath("//a[@href='../../gift-cards?src=header']")).click();
	      dr.findElement(By.xpath("//li[@class='_11b4v']")).click();
	      dr.findElement(By.xpath("//input[@name='amount_select']")).sendKeys("5000");
	      dr.findElement(By.xpath("(//button[@type='button'])[8]")).click();
	      dr.findElement(By.xpath("(//button[@type='button'])[8]")).click();
	      dr.findElement(By.xpath("//input[@id='ip_4036288348']")).sendKeys("Annu");
	      dr.findElement(By.xpath("//input[@id='ip_137656023']")).sendKeys("anubhavrajput57@gmail.com");
	      dr.findElement(By.xpath("//input[@id='ip_1082986083']")).sendKeys("Anubhav");
	      dr.findElement(By.xpath("//input[@id='ip_4081352456']")).sendKeys("anubhavrjaput193@gmail.com");
	      dr.findElement(By.xpath("//input[@id='ip_2121573464']")).sendKeys("7060577074");
	      dr.findElement(By.xpath("//textarea[@id='ip_582840596']")).sendKeys("special gift");
	     

	    
	}
}

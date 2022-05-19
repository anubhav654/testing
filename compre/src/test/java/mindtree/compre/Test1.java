package mindtree.compre;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
@Test
	public static void test1() {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\mindsdet300\\Downloads\\geckodriver.exe");
	      WebDriver dr=new FirefoxDriver();
	      dr.get("https://www.urbanladder.com");
	      dr.findElement(By.xpath("//input[@id='search']")).sendKeys("chairs");
	      dr.findElement(By.xpath("//button[@id='search_button']")).click();
	      dr.findElement(By.xpath("//div[@class='product-title product-title-sofa-mattresses']")).click();
	      String currentHandle= dr.getWindowHandle();
	      Set<String> handles=dr.getWindowHandles();
	      for(String actual: handles) {
	      if(!actual.equalsIgnoreCase(currentHandle)) {
	      //Switch to the opened tab
	      dr.switchTo().window(actual); 
	      //opening the URL saved.
	      dr.get("https://www.urbanladder.com/products/hathwin-outdoor-chair?sku=FVODCH61BK14966&src=subcat");
	      }
	      }
	      //dr.navigate().to("https://www.urbanladder.com/products/hathwin-outdoor-chair?sku=FVODCH61BK14966&src=subcat");
	      dr.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
	      dr.findElement(By.xpath("//button[@id='checkout-link']")).click();
      //dr.navigate().to("https://www.urbanladder.com/cart");
	      dr.findElement(By.xpath("//input[@id='order_email']")).sendKeys("anubhavrajput193@gmail.com");
	      dr.findElement(By.xpath("//input[@id='order_ship_address_attributes_zipcode']")).sendKeys("110008");
	      dr.findElement(By.xpath("//textarea[@id='order_ship_address_attributes_address1']")).sendKeys("Delhi");
	      dr.findElement(By.xpath("//input[@id='order_ship_address_attributes_firstname']")).sendKeys("Annu");
	      dr.findElement(By.xpath("//input[@id='order_ship_address_attributes_lastname']")).sendKeys("Rajput");
	      dr.findElement(By.xpath("//input[@id='order_ship_address_attributes_phone']")).sendKeys("7060577074");
	      dr.findElement(By.xpath("//input[@id='address-form-submit']")).click();
	      
	}

}

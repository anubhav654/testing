package mindtree.compre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test2 {
    @Test
	public static void Test2() throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\mindsdet300\\Downloads\\geckodriver.exe");
	      WebDriver dr=new FirefoxDriver();
	      dr.get("https://www.urbanladder.com");
	      dr.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
	      Thread.sleep(2000);
	      dr.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
	      WebDriverWait wait=new WebDriverWait(dr,20);
	      WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='email required input_authentication']")));
	      ele.sendKeys("anubhavrajput193@gmail.com");
	      WebElement ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='required input_authentication']")));
	      ele1.sendKeys("Anubhav@@7060");
	      WebElement ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button primary']")));
	      ele2.click();
	      WebElement ele3=dr.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']"));
	      Actions ac=new Actions(dr);
	      ac.moveToElement(ele3).perform();
	      dr.findElement(By.xpath("//a[@href='/profile']")).click();
	      
	     
	}

}

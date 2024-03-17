package Pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage {

	
public WebDriver driver;
	
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    public void Open_Cart () {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
    	
    }
    
    public void Verify_Item_added () {
    	
    	String CartSubtotal = driver.findElement(By.id("sc-subtotal-label-activecart")).getText();
    	Assert.assertTrue(CartSubtotal.contains("Subtotal (1 item)"), "item exist'");
    }
}

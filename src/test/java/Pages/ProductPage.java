package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;


public class ProductPage {
	
public WebDriver driver;
	
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void veriyProductName () {
    	
    	WebElement ProductName = driver.findElement(By.id("productTitle"));
    	String ProductTitle = ProductName.getText();
    	Assert.assertTrue(ProductTitle.contains("SAMSUNG Galaxy S24 Ultra"), "Ttile is true'");
    }
    
    public void clicAddToCart () {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driver.findElement(By.id("add-to-cart-button")).click();
    	WebElement skipbttn = driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input"));
    	skipbttn.click();
    }

}

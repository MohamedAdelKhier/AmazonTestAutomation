package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class ProductList {
	
	
public WebDriver driver;
	
    public ProductList(WebDriver driver) {
        this.driver = driver;
    }
    
    
    public void SelectProduct () {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	WebElement Product = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[2]/div[2]/h2/a/span"));
    	Product.click();
    }

}

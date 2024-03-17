package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class HomePage {

	public WebDriver driver;
	
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage(String url) {
        driver.get(url);
    }

    public void searchForProduct(String productName) throws InterruptedException {
    	 driver.findElement(By.id("twotabsearchtextbox")).click();
    	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    	 Thread.sleep(300);
    	 driver.findElement(By.id("nav-search-submit-button")).click();
		
    }
}
	

	
	
	 
	 




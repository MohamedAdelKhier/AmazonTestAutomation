package TestExecution;



import org.openqa.selenium.WebDriver;
import Pages.HomePage;
import Pages.ProductList;
import Pages.ProductPage;
import Pages.CartPage;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTestAutomation {

    private WebDriver driver;
    
    

    @BeforeClass
    public void setUp()  {
        // Initialize WebDriver
    	System.setProperty("webdriver.edge.driver", "DriversFolder/msedgedriver.exe");
        driver = new EdgeDriver();
        
        // Initialize Page Objects
     
      
    }
    
    @Test
    public void testAddProductToCart() throws InterruptedException {
    	
    	HomePage homePage = new HomePage(driver);
    	ProductList product = new ProductList(driver);
    	ProductPage ProductDetails = new ProductPage(driver);
    	CartPage CartActions = new CartPage(driver);
    	
    	// Step 1: Navigate to Amazon website   
           homePage.navigateToHomePage("https://www.amazon.eg/-/en/");
       // Step 2: search for the product   
           homePage.searchForProduct("Samsung S24 ultra");
       // Step 3: select product
           product.SelectProduct();
       // Step 4 : check the product name
           ProductDetails.veriyProductName();
       // step 5 : add product to cart
           ProductDetails.clicAddToCart();
       // step 6 : verify that the product added to cart
           CartActions.Open_Cart();
           CartActions.Verify_Item_added();
           
       
    	
    }
    
    @AfterMethod
    public void tearDown() {
        // Quit WebDriver
        driver.quit();
    }
	
}

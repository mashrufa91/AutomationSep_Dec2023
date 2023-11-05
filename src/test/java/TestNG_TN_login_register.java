import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_TN_login_register {
	WebDriver driver;
	@BeforeMethod
	public void opnApplctn() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
	}

	@Test (priority=1)
	public void loginTest() {
        driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	@Test (priority=2)
	public void TNRegisterTest() throws InterruptedException {
		
	
		
		driver.findElement(By.linkText("Register")).click();	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Mashrufa100");
		
		driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys("Shanjia100");
		
		driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("mashrufashanjia100@gmail.com");
		
		driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys("9876543210");
		
		driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Mashrufa@123");
		
		driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys("Mashrufa@123");
		//driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1).input")).click();
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
	driver.quit();}
}

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
 String url ="https://www.phptravels.net/public/expedia/";
driver.get(url);

WebElement SearchBar=driver.findElement(By.xpath("//input[@id='citiesInput']"));

SearchBar.sendKeys("Sardinia Island, Italy");
WebElement CheckIn=driver.findElement(By.xpath("//input[@placeholder='Check in']"));
CheckIn.sendKeys("03/28/2019");
WebElement CheckOut=driver.findElement(By.xpath("//input[@placeholder='Check out']"));
CheckOut.sendKeys("04/04/2019");
WebElement searchButton=driver.findElement(By.xpath("//button[contains(text(),'Search')]"));

	searchButton.click();
	
	driver.navigate().to("https://www.phptravels.net/public/expedia/properties/hotel/1771577/AC11000A-D653-1791-69B2-B0DE3BC909CA?adults=2&checkin=03/28/2019&checkout=04/04/2019");
	WebElement Book=driver.findElement(By.xpath("//form[1]//div[1]//div[3]//div[2]//span[1]"));
	Book.click();
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //Thread.sleep(5000);
 
 WebElement asGuest = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[6]/section[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]"));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   // Thread.sleep(5000);
    asGuest.click();
    WebElement Name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
    Name.sendKeys("Marija");
    WebElement Surname=driver.findElement(By.xpath("//input[@id='card-holder-lastname']"));
    Surname.sendKeys("Ma");
    
    WebElement Email=driver.findElement(By.xpath("//input[@id='card-holder-email']"));
    Email.sendKeys("Ma@gmail.com");
    WebElement Number=driver.findElement(By.xpath("//input[@id='card-holder-phone']"));
    Number.sendKeys("Ma");
    
    
	}
	

}
		

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        String urlNews = "https://www.youtube.com/";
        driver.get(urlNews);
        
        WebElement searchBar = driver.findElement(By.id("search"));
        searchBar.sendKeys("Rick Astley");
        
        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement playSong = driver.findElement(By.xpath("//a[contains(text(),'Rick Astley - Never Gonna Give You Up (Official Mu')]"));
        playSong.click();
        WebElement pausePlayButton = driver.findElement(
                By.xpath("//button[@class='ytp-play-button ytp-button']"));

        pausePlayButton.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        pausePlayButton.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        pausePlayButton.click();
      
        List<WebElement> playSecondRecomended = driver.findElements(By.className("ytd-compact-video-renderer"));
        playSecondRecomended.get(2).click();
      //  List<WebElement> lst1=new ArrayList<>();
      //  List<WebElement> lst2=driver.findElements(By.className("style-scope ytd-watch-next-secondary-results-renderer"));
        	//	System.out.println(lst2.get(2));
        
       // WebElement recommend = driver.findElements(By.className("style-scope ytd-video-meta-block"));
	}

}

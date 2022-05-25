package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRowsColumns {
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://html.com/tags/table/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement table=driver.findElement(By.xpath("//table//tbody//tr[1]"));
	
	//List<WebElement> rows=table.findElements(By.tagName("tr"));
	List<WebElement> rows=table.findElements(By.xpath("//table//tbody"));
	System.out.println("Number of row:"+rows.size());
	
	WebElement findElement = driver.findElement(By.xpath("(//table//tbody//tr)[1]"));
	List<WebElement> cols=findElement.findElements(By.tagName("td"));
	System.out.println("Number of Columns:"+cols.size());
			
	}
	
	
}

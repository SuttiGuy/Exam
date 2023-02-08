import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Examtest {

	@Test
		void test() throws InterruptedException {
			WebDriver driver = null;
			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://nxtgenaiacademy.com/demo-site/");
			
			//1
			driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Suttiporn");
			driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Kaewsakunnee");
			
			
			
			//3
			driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("54 M.4 T.Wangyen");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("-");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Mueang");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("Nakhon Pathom");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("73000");
			
			
			//4
			driver.findElement(By.id("vfb-14")).sendKeys("644259025@webmail.npru.ac.th");	
			
			//7
			driver.findElement(By.id("vfb-19")).sendKeys("0614294288");
			
			//9
			driver.findElement(By.id("vfb-23")).sendKeys("Hello World");
			
			//10
			driver.findElement(By.id("vfb-3")).sendKeys("99");
			driver.findElement(By.id("vfb-4")).click();
			
			
			
			String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
	        if(result.equalsIgnoreCase("Dynamic Transaction Verification"))
	            System.out.println("Pass");
	        else
	            System.out.println("Fail");
	        
	        Thread.sleep(5000);
			driver.quit();
	}

}

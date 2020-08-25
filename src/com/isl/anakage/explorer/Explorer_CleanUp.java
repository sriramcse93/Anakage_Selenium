package com.isl.anakage.explorer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explorer_CleanUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\ISL\\chromedriver_win32-Test\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    //Chatbot URL
	driver.navigate().to("http://localhost:4200/");
	// Self-Help Chatbot
	driver.findElement(By.xpath("/html/body/app-root/app-chat/div/button/span/mat-icon/span")).click();
	Thread.sleep(1000);
	//InternetExplorer
	driver.findElement(By.xpath("/html/body/app-root/app-chat/div[1]/div/div[2]/div/mat-card/button[5]")).click();
	Thread.sleep(1500);
	// How to clean up the internet explorer Download
	driver.findElement(By.xpath("//*[@id=\"sub_menu_2_2\"]/mat-card-content/mat-card-title")).click();
	Thread.sleep(1500);
	// Was I able to solve your issue? Yes
		/*driver.findElement(By.xpath("//*[@id=\"like_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
							
		//Hope the solution helped you!! Do you need further assistance. No
		driver.findElement(By.xpath("//*[@id=\"dislike_button_5\"]/span/mat-icon/span")).click();*/
				/*       END               */
		// Was I able to solve your issue? No
	/*	driver.findElement(By.xpath("//*[@id=\"dislike_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
						
		//Do you want to create a ticket for the above issue Yes
		driver.findElement(By.xpath("//*[@id=\"like_button_5\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);*/
				/*   END    */
		// Was I able to solve your issue? No
		/*driver.findElement(By.xpath("//*[@id=\"dislike_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
						
		//Do you want to create a ticket for the above issue No
		driver.findElement(By.xpath("//*[@id=\"dislike_button_5\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
						
		//You can comeback again to create the ticket anytime. Do need help on other problems? No
		driver.findElement(By.xpath("//*[@id=\"dislike_button_6\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);*/
				/*   END  */
				
		// Was I able to solve your issue? Yes
		driver.findElement(By.xpath("//*[@id=\"like_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
		// Hope the solution helped you!! Do you need further assistance yes
		driver.findElement(By.xpath("//*[@id=\"like_button_5\"]/span/mat-icon/span")).click();
	
	
}
}

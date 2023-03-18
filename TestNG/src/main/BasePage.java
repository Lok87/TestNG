package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	

		public void waitForElement(WebDriver driver, Duration timeInSeconds, By locator) {
			
			WebDriverWait wait = new WebDriverWait(driver,timeInSeconds);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}​
}


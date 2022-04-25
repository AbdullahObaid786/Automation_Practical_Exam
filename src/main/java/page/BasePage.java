package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public int generateRandomNumber(int boundryNumber) {
		Random ran = new Random();
		return ran.nextInt(boundryNumber);

	}

	public void selectFromDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);

	}

	public void waitForElelement(WebDriver driver, int timeInSeconds, WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(webElement));

	}
}

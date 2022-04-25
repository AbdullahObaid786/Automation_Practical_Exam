package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidationAllCheckBoxes extends BasePage {

	WebDriver driver;
	
	public ValidationAllCheckBoxes (WebDriver driver) {
		this.driver = driver;
	}
	
	WebElement toggleAllCheckBoxes = driver.findElement(By.cssSelector("input[type='checkbox'][name='allbox']"));
	
	public void validateToggleAllCheckBoxes () {
		toggleAllCheckBoxes.click();
	}
	
	
}

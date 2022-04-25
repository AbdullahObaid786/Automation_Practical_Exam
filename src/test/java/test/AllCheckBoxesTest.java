package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ValidationAllCheckBoxes;
import util.BrowserFactory;

public class AllCheckBoxesTest {

	WebDriver driver;
	
	
	@Test
	public void userShouldBeAbleToClickAllCheckboxes () {
		driver = BrowserFactory.init();
		ValidationAllCheckBoxes validationAllCheckboxes = PageFactory.initElements(driver, ValidationAllCheckBoxes.class);
		
	}
	
	
	
	
}

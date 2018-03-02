package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
		public void verifyordernumber(String E_order_number){
			WebDriverWait wait=new WebDriverWait(driver,5);
				try{
					wait.until(ExpectedConditions.titleContains(E_order_number));
					Reporter.log("PASS: Title is Matching",true);
				}
				catch(Exception e){
					Reporter.log("FAIL: Title is NOT Matching",true);
					Assert.fail();
				}
		}
	
		public void sleep(int i){
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ebayHome {
	WebDriver driver;
	By txtSearch = By.id("gh-ac");
	By btnSearch = By.id("gh-btn");
	
	public ebayHome(WebDriver driver){
		this.driver = driver;
	}
	
	public void setTxtSearch(String strTxtSearch){
		driver.findElement(txtSearch).sendKeys(strTxtSearch);
	}
	
	public void clickSearch(){
        driver.findElement(btnSearch).click();
	}

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void searchInEbay(String strTxtSearch){
        this.setTxtSearch(strTxtSearch);
        this.clickSearch();        
    }
	
}

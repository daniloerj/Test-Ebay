package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ebaySearch {
	WebDriver driver;
	
	 By brand = By.xpath("/html/body/div[3]/div[4]/ul/li[1]/ul/li[2]/ul/li[2]/div[2]/div[1]/ul/li[6]/div/a/div/input");
	 
	 By size = By.xpath("/html/body/div[3]/div[4]/ul/li[1]/ul/li[2]/ul/li[1]/div[2]/ul/li[5]/div/a/div/input");
	 
	 By result = By.xpath("/html/body/div[3]/div[5]/div[1]/div/div[2]/div/div[1]/h1");
	 
	public ebaySearch(WebDriver driver){
		this.driver = driver;
	}
	
//	public void setTxtSearch(String strTxtSearch){
//		driver.findElement(txtSearch).sendKeys(strTxtSearch);
//	}
	
	public void clickBrand(){
        driver.findElement(brand).click();
	}
	
	public void clickSize(){
        driver.findElement(size).click();
	}
	
	 public String getResults(){

	     return    driver.findElement(result).getText();

	    }

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void searchBrandInEbay(){
        this.clickBrand();        
    }
    
    public void searchSizeInEbay(){
        this.clickSize();        
    }
    

}

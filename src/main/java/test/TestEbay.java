package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import pages.ebayHome;
import pages.ebaySearch;


public class TestEbay extends TestCase{
	WebDriver driver;

    ebayHome pageHome;

    ebaySearch pageSearch;

    @Before
    public void setup(){

        System.out.println("entro");
    	driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.ebay.com/");

    }

    @Test
    public void test_Home_P_Correct(){

    pageHome = new ebayHome(driver);

    pageHome.searchInEbay("shoes");

    pageSearch = new ebaySearch(driver);
    
    pageSearch.searchBrandInEbay();
    pageSearch.searchSizeInEbay();
    System.out.println(pageSearch.getResults());
    
}

}
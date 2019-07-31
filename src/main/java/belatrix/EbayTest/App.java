package belatrix.EbayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class App 
{
	// Driver y Navegador a usar
	static String driverClient = "webdriver.chrome.driver";
	static String pathDriverClient = "driver\\chromedriver.exe";
	static ChromeOptions optionsChrome = null;
	
	static String baseUrl = "https://www.ebay.com/";
	static WebDriver driver = null;
    public static void main( String[] args )
    {
    	// TODO Auto-generated method stub
    			if (driverClient == "webdriver.chrome.driver") {
    				optionsChrome = new ChromeOptions();
    				optionsChrome.addArguments("--lang=es");
    			}
    			System.setProperty(driverClient, pathDriverClient);
    			driver = new ChromeDriver(optionsChrome);
    			driver.manage().window().maximize();
    			driver.manage().deleteAllCookies();
    			driver.get(baseUrl);
    			WebDriverWait wait = new WebDriverWait(driver, 10);
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gh-ac\"]")));
    				WebElement txtSearch = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
    				txtSearch.sendKeys("shoes");
    			} catch (Exception e) {
    				System.out.println("Campo txtSearch not found: \n" + e.getMessage() + "\n"); 
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gh-btn\"]")));
    				WebElement btnSearch = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
    				btnSearch.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo btnSearch not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w3-w12\"]/ul/li[7]")));
    				WebElement lnkBrand = driver.findElement(By.xpath("//*[@id=\"w3-w12\"]/ul/li[7]"));
    				lnkBrand.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkBrand not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-query_answer1-w0-x-carousel-items\"]/ul/li[9]")));
    				WebElement lnkSize = driver.findElement(By.xpath("//*[@id=\"srp-river-results-query_answer1-w0-x-carousel-items\"]/ul/li[9]"));
    				lnkSize.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkSize not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mainContent > div.s-answer-region.s-answer-region-center-top > div > div:nth-child(2) > div > div.srp-controls__control.srp-controls__count > h1")));
    				WebElement lblResults = driver.findElement(By.cssSelector("#mainContent > div.s-answer-region.s-answer-region-center-top > div > div:nth-child(2) > div > div.srp-controls__control.srp-controls__count > h1"));
    				System.out.println("the results are: " + lblResults.getText() + "\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lblResults not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w7\"]/button/div")));
    				WebElement lnkOrderBy = driver.findElement(By.xpath("//*[@id=\"w7\"]/button/div"));
    				lnkOrderBy.click();
    				lnkOrderBy.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkOrderBy not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w7\"]/div/div/ul/li[4]/a")));
    				WebElement lnkOrderPriceAscendant = driver.findElement(By.xpath("//*[@id=\"w7\"]/div/div/ul/li[4]/a"));
    				lnkOrderPriceAscendant.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkOrderPriceAscendant not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/div[3]/div[1]/span"));
    				assertEquals("Puma Hombres Dive-Cat Zapatillas Negro Calzado para Correr Playa diapositiva Gimnasio Sandales 36940001" , lnkResult.getText());
    				System.out.println("First Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFirstResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/div[3]/div[1]/span"));
    				assertEquals("Puma Pop Cat diapositivas (36026523) Sandalias De Playa Flip Flop Zapatos Zapatillas diapositiva" , lnkResult.getText());
    				System.out.println("Second Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkSecondResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/div[3]/div[1]/span"));
    				assertEquals("Las diapositivas del gato Puma plomo (36026302) Deportes Sandalias Flip Flop Zapatos Zapatillas diapositiva" , lnkResult.getText());
    				System.out.println("Third Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkThirdResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/div[3]/div[1]/span"));
    				assertEquals("Las diapositivas del gato Puma plomo (36026301) Deportes Sandalias Flip Flop Zapatos Zapatillas diapositiva" , lnkResult.getText());
    				System.out.println("Fourth Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFourthResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/div[3]/div[1]/span"));
    				assertEquals("Las diapositivas del gato Puma plomo (36026308) Deportes Sandalias Flip Flop Zapatos Zapatillas diapositiva" , lnkResult.getText());
    				System.out.println("Fifth Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFifthResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w7\"]/button/div")));
    				WebElement lnkOrderBy = driver.findElement(By.xpath("//*[@id=\"w7\"]/button/div"));
    				lnkOrderBy.click();
    				lnkOrderBy.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkOrderBy not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w7\"]/div/div/ul/li[1]/a")));
    				WebElement lnkOrder = driver.findElement(By.xpath("//*[@id=\"w7\"]/div/div/ul/li[1]/a"));
    				lnkOrder.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkOrder not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/div[3]/div[1]/span[1]"));
    				System.out.println("First Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFirstResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Second Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkSecondResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Third Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkThirdResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Fourth Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFourthResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Fifth Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFifthResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w7\"]/button/div")));
    				WebElement lnkOrderBy = driver.findElement(By.xpath("//*[@id=\"w7\"]/button/div"));
    				lnkOrderBy.click();
    				lnkOrderBy.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkOrderBy not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"w7\"]/div/div/ul/li[5]/a")));
    				WebElement lnkOrder = driver.findElement(By.xpath("//*[@id=\"w7\"]/div/div/ul/li[5]/a"));
    				lnkOrder.click();
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkOrder not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/div[3]/div[1]/span[1]"));
    				System.out.println("First Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFirstResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Second Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkSecondResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Third Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkThirdResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Fourth Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFourthResult not found: \n" + e.getMessage() + "\n");
    			}
    			try {
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a/h3")));
    				WebElement lnkResult = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a/h3"));
    				WebElement priceProduct = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/div[3]/div[1]/span"));
    				System.out.println("Fifth Product:"+lnkResult.getText());
    				System.out.println("Price:"+priceProduct.getText());
    				System.out.println("\n");
    			} catch (Exception e) {
    				// TODO: handle exception
    				System.out.println("Campo lnkFifthResult not found: \n" + e.getMessage() + "\n");
    			}
    }
}

package pageObjectModel;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Ebay {
	WebDriver driver;
	
	By _search= By.id("gh-ac");
	By _selectBrand= By.cssSelector("[aria-label='PUMA']");
	By _selectStatus= By.cssSelector("[aria-label=\"Nuevo\"]");
	By _printResult= By.cssSelector("[class=\"srp-controls__count-heading\"]");
	By _orderAscendant= By.cssSelector("[class=\"srp-controls--selected-value\"]");
	By _orderAscendantClick= By.cssSelector("[class=\"srp-sort__menu\"] li:nth-child(4) a");
	By _product1= By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/div[3]/div[1]/span");
	By _product2= By.cssSelector("h3[class=\"s-item__title\"]");
	By _product3= By.cssSelector("span[class=\"s-item__price\"]");
	By _maximunTominimun= By.xpath("//*[@id=\"w4-w3\"]/div/div/ul/li[5]/a");
	
	

	//*[@id="w4-w3"]/div/div/ul/li[4]/a	
	public Home_Ebay(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement search() {
		return driver.findElement(_search); 
	}
	
	public WebElement selectBrand() {
		return driver.findElement(_selectBrand);
	}
	
	public WebElement selectStatus() {
		return driver.findElement(_selectStatus);
	}
	
	public WebElement printResult() {
		return driver.findElement(_printResult);
	}
	public WebElement orderAscendant() {
		return driver.findElement(_orderAscendant);
	}
	public WebElement orderAscendantClick() {
		return driver.findElement(_orderAscendantClick);
	}	
	
	public List<WebElement> product2() {
		return driver.findElements(_product2);
	}
	public List<WebElement> product3() {
		return driver.findElements(_product3);
	}
	
	public  WebElement maximunTominimun() {
		return driver.findElement(_maximunTominimun);
	}
	

}

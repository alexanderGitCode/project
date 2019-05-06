package stepDefination;





import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjectModel.Home_Ebay;


@RunWith(Cucumber.class)
public class stepdefination extends Base {

	public static Home_Ebay pageHome;

	@Given("^Enter to Ebay \"([^\"]*)\"$")
    public void enter_to_ebay_something(String strArg1) throws Throwable {
		driver =anybrowser();
		driver.get(strArg1);

	}	
	 @And("^Search for shoes$")
	    public void search_for_shoes() throws Throwable {
		 pageHome= new Home_Ebay(driver);
		 pageHome.search().sendKeys("shoes");
		 pageHome.search().sendKeys(Keys.ENTER);
	    }
	
	@And("^Select brand PUMA$")
    public void select_brand_puma() throws Throwable {
		pageHome.selectBrand().click();

	}

	@Given("^Select status New with box$")
    public void select_status_new_with_box() throws Throwable {
    	pageHome.selectStatus().click();
    }
    
    @When("^Print the number of results$")
    public void print_the_number_of_results() throws Throwable {
    	String printResultShoes= pageHome.printResult().getText();
    	System.out.println(printResultShoes);    	
        
    }
    
    
    @And("^Order by price ascendant$")
    public void order_by_price_ascendant() throws Throwable {    		
    	
    	Actions action= new Actions(driver);
    	action.moveToElement(pageHome.orderAscendant()).build().perform();
    	pageHome.orderAscendantClick().click();
    	    	
    	
        
    }
    
    @When("^Take the first five products with their prices and print them in console$")
    public void take_the_first_five_products_with_their_prices_and_print_them_in_console() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	int i=0;
    	for(i=0;i<5;i++) {       		
       		
    		System.out.println(pageHome.product3().get(i).getText());
       		
       	}
    }

    @When("^Order and print the products by name ascendant$")
    public void order_and_print_the_products_by_name_ascendant() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	int i=0;
    	for(i=0;i<5;i++) {       		
       		
       		System.out.println(pageHome.product2().get(i).getText());

           	}
    }

    @When("^Order and print the products by price in descendant mode$")
    public void order_and_print_the_products_by_price_in_descendant_mode() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Actions action= new Actions(driver);
    	int i=0;
    	action.moveToElement(pageHome.orderAscendant()).build().perform();
    	pageHome.maximunTominimun().click();
       	for(i=0;i<5;i++) {       		
       		
       		System.out.println(pageHome.product3().get(i).getText());    		

       	}
    }

    @When("^Order by price ascendant again$")
    public void order_by_price_ascendant_again() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Actions action= new Actions(driver);
    	action.moveToElement(pageHome.orderAscendant()).build().perform();
    	pageHome.orderAscendantClick().click();
    	    	
    	
    	
    }

    @Then("^Assert the order taking the first five results$")
    public void assert_the_order_taking_the_first_five_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	
    	
		int i=0;
		boolean condition=true;
		double priceA=0,priceB=0, priceC=0, priceD=0, priceF=0;
		for(i=0;i<5;i++) {       		
			
			if(i==0) {				
			   priceA=convertStringToNumber(pageHome.product3().get(i).getText());			
				
			}
			else if(i==1) {
				priceB=convertStringToNumber(pageHome.product3().get(i).getText());
			}
			
			else if(i==2) {
				priceC=convertStringToNumber(pageHome.product3().get(i).getText());
			}
			else if(i==3) {
				priceD=convertStringToNumber(pageHome.product3().get(i).getText());
			}
			else if(i==4) {
				priceF=convertStringToNumber(pageHome.product3().get(i).getText());
			}
	    	          
			if(priceA < priceB &&  priceB < priceC && priceC < priceD &&  priceD < priceF ) {
				System.out.print("Pass, The prices order are correct");
				 condition= true;
				
			}
			else {
				condition= false;				
				
				break;
			}	
				
			
            
            }
			
		
			driver.close();
			Assert.assertTrue(condition);		
			/*SoftAssert softassert=new SoftAssert();
			softassert.assertTrue(condition);			
			driver.close();
			softassert.assertAll();*/
			
		
	    
		

	    
	        
		
	        
	       
    }

    
}

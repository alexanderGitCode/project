package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.Test;

import com.google.common.io.Files;




public class Base {
	

	//private static Logger Log=LogManager.getLogger(base.class.getName());

	//with static the variable can take the value from method anybrowser() that is below
	public static WebDriver driver;
	public Properties prop;
	
	//@Test
	public WebDriver anybrowser() throws IOException {
		
		prop= new Properties();
		FileInputStream fil= new FileInputStream("C:\\Users\\ALEX\\PullProjects\\src\\main\\java\\resources\\base\\data.properties");
		prop.load(fil);
		String propertyBrowser=prop.getProperty("browser");
		
		
		if(propertyBrowser.equals("chrome")) {
			 driver = new ChromeDriver();
			 System.out.println("i am chrome go ahead");
			}
		else if(propertyBrowser=="firefox") {
			 driver = new FirefoxDriver();
		}
		else {
			 driver=new InternetExplorerDriver();			
		}
		//Log.info("I have executed well a webdriver");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	public void screenshots()  {
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C://code//java//ProFrameworkv//screenshot//test-"+receivenametest+".png"));
		
	}
	
	public void gh(String receivenamefromtest) throws IOException  {	
		 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		Files.copy(src, new File("C:\\code\\java\\ProFrameworkv\\screenshot\\tets-"+receivenamefromtest+".png"));	
		
	}
	
	public double convertStringToNumber(String price) {
		String number=price;
		String  space=number.substring(6,7);
		String space2=number.substring(7,8);
		double stringToNumber = 0;
		if(space.equalsIgnoreCase(" ") || space2.equalsIgnoreCase(" ")) {
			String  n=number.replace(" ", "");
			String onlyNumbers=n.substring(4);
			stringToNumber=Double.parseDouble(onlyNumbers);
			  
			  }		  
		
		return stringToNumber;				
	}

	
	
}

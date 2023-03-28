package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass extends ExtentReport {
	
	AndroidDriver<WebElement> driver;
	
    @BeforeTest
	public void Setup() throws MalformedURLException
	{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	
	//dc.setCapability(MobileCapabilityType.APP,"/Users/bilalhaider/Downloads/sss.apk");
	dc.setCapability("appPackage" , "com.sssports.sssports");
	dc.setCapability("appActivity" , "com.sssports.splash.presentation.view.SplashScreenRevampActivity");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AndroidDriver<WebElement>(url,dc);
	
	}
   
  
	
    @AfterTest	
	public void Teardown()

	{
		
	
	}
    
    

    }


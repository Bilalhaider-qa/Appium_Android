package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.interactions.Actions;


public class TestCases extends Baseclass {
	WebDriverWait wait;
	TouchAction action;
	
	@Test(priority = 1)

	public void countryselector() throws InterruptedException
	{
	
	//ExtentTest test1 = Report.createTest("T1","UAE");
	//test1.log(Status.INFO, "Testcase started");

	String uae = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]";
	 wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(uae)));
	WebElement country = driver.findElementByXPath(uae);
	 Assert.assertTrue(country.isDisplayed());
	
	driver.findElementByXPath(uae).click();
	Thread.sleep(5000);
	
}
@Test(priority = 2)
public void PreferenceGender() throws InterruptedException

{
	String PGender ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout[1]/android.view.View";
	 wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PGender)));
	WebElement PGender1 = driver.findElementByXPath(PGender);
	 Assert.assertTrue(PGender1.isDisplayed());
	 new Actions(driver).clickAndHold(PGender1).perform();


	driver.findElementByXPath(PGender).click();
	 Thread.sleep(2000);
	// driver.findElementByXPath(PGender).click();
	
}

@Test(priority = 3)
public void MyAccount() throws InterruptedException
{
	String MyAcc ="//android.widget.FrameLayout[@content-desc=\"Account\"]/android.widget.ImageView";
	 wait = new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MyAcc)));
	WebElement Account = driver.findElementByXPath(MyAcc);
	 Assert.assertTrue(Account.isDisplayed());
	
	 driver.findElementByXPath(MyAcc).click();
	 Thread.sleep(3000);
	}


@Test(priority = 4)
public void Signin() throws InterruptedException
{
	String Signinlnk ="com.sssports.sssports:id/txtSignIn";
	 wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Signinlnk)));
	WebElement Sinlnk = driver.findElementById(Signinlnk);
	 Assert.assertTrue(Sinlnk.isDisplayed());
	 new Actions(driver).clickAndHold(Sinlnk).perform();
	 driver.findElementById(Signinlnk).click();
	
	 //Passing Email in Email Field
	 
	String TxtEmail ="com.sssports.sssports:id/emailField";
	 wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(TxtEmail)));
		WebElement Email = driver.findElementById(TxtEmail);
		 Assert.assertTrue(Email.isEnabled());
		 driver.findElementById(TxtEmail).sendKeys("bilal.haider+auto@werplay.com");
		 
	//Passing Password in Password Field
	String TxtPwd ="com.sssports.sssports:id/editInputText";
			WebElement Password = driver.findElementById(TxtPwd);
			 Assert.assertTrue(Password.isEnabled());
			 driver.findElementById(TxtPwd).sendKeys("Asdf@123");
			 Thread.sleep(3000);
			 
		//Clicking on Signin Button	 
	String SigninButton ="com.sssports.sssports:id/buttonLogin";
	WebElement Sbutton = driver.findElementById(SigninButton);
	 Assert.assertTrue(Sbutton.isDisplayed());
	 driver.findElementById(SigninButton).click();
			 
	 
	 Thread.sleep(4000);
}

@Test(priority = 5)
public void HomeToPLP() throws InterruptedException
{
	String HomeBtn ="//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView";
	WebElement Home = driver.findElementByXPath(HomeBtn);
	 Assert.assertTrue(Home.isDisplayed());
	 driver.findElementByXPath(HomeBtn).click();
	 Thread.sleep(5000); 
	
	 action =new TouchAction(driver);	
	 Dimension size	=driver.manage().window().getSize();
	 int width=size.width;
	 int height=size.height;				
	 int middleOfX=width/2;
	 int startYCoordinate= (int)(height*.9);
	 int endYCoordinate= (int)(height*.05);
	
	 				
	 action.press(PointOption.point(middleOfX, startYCoordinate))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	 .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	 
	 Thread.sleep(2000);
	 
	 action.press(PointOption.point(middleOfX, startYCoordinate))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	 .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	 
	 Thread.sleep(2000);
	 int startYCoordinate1= (int)(height*.4);
	 int endYCoordinate1= (int)(height*.08);
	 
	 action.press(PointOption.point(middleOfX, startYCoordinate1))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	 .moveTo(PointOption.point(middleOfX, endYCoordinate1)).release().perform();
	 
	 String PLPBtn ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView";
		WebElement PLP = driver.findElementByXPath(PLPBtn);
		 Assert.assertTrue(PLP.isDisplayed());
		 driver.findElementByXPath(PLPBtn).click();
		 Thread.sleep(5000);
		
		 	
		 String FilterBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView";
		 WebElement Fltr = driver.findElementByXPath(FilterBtn);
		 Assert.assertTrue(Fltr.isDisplayed());
		 driver.findElementByXPath(FilterBtn).click();
		 Thread.sleep(3000);
		 
		 String FilterBrand = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView";
		 WebElement Brand = driver.findElementByXPath(FilterBrand);
		 Assert.assertTrue(Brand.isDisplayed());
		 driver.findElementByXPath(FilterBrand).click();
		 Thread.sleep(3000);
		 
		 String ApplyBtn = "com.sssports.sssports:id/applyBtn";
		 WebElement Apply = driver.findElementById(ApplyBtn);
		 Assert.assertTrue(Apply.isDisplayed());
		 driver.findElementById(ApplyBtn).click();
		 Thread.sleep(2000);
	 
	 

	// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).scrollIntoView(new UiSelector().textStartsWith(\""+PLPBTN+"\").instance(0))").click();
	 
	 //String PLP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.ImageView";
	// WebElement Listing = driver.findElementByXPath(PLP);
//	 Assert.assertTrue(Listing.isDisplayed());
	// driver.findElementByXPath(PLP).click();
	Thread.sleep(10000);
}

@Test(priority = 6)
public void PDP() throws InterruptedException
{
	String PLPImg = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView";
	WebElement PLPList = driver.findElementByXPath(PLPImg);
	Assert.assertTrue(PLPList.isDisplayed());
	driver.findElementByXPath(PLPImg).click();
	Thread.sleep(5000);
	
	String PDPImg = "com.sssports.sssports:id/productImage";
	WebElement Img = driver.findElementById(PDPImg);
	Assert.assertTrue(Img.isDisplayed());
	driver.findElementById(PDPImg).click();
	Thread.sleep(3000);
	
	action = new TouchAction(driver);

	// Get the size of the screen
	Dimension screenSize = driver.manage().window().getSize();

	// Calculate the start and end points for the swipe gesture
	int startX = (int) (screenSize.width * 0.8);
	int startY = (int) (screenSize.height * 0.5);
	int endX = (int) (screenSize.width * 0.2);
	int endY = (int) (screenSize.height * 0.5);

	// Perform the swipe gesture by pressing and moving from the start point to the end point
	action.press(PointOption.point(startX, startY))
	           .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // optional delay
	           .moveTo(PointOption.point(endX, endY))
	           .release()
	           .perform();
	
	// Swiping to Second Image
	
	action.press(PointOption.point(startX, startY))
    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // optional delay
    .moveTo(PointOption.point(endX, endY))
    .release()
    .perform();
	
	// Swiping to Third Image
	
	action.press(PointOption.point(startX, startY))
    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // optional delay
    .moveTo(PointOption.point(endX, endY))
    .release()
    .perform();
	
	//Going back to PDP
	driver.navigate().back();
	
	//Select another Colour Swatch
	
//	String Swatch = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView";
//	WebElement CSwatch = driver.findElementByXPath(Swatch);
	//Assert.assertTrue(CSwatch.isDisplayed());
	//driver.findElementByXPath(Swatch).click();
//	Thread.sleep(5000);
	
	//Click on Selct Size
	
	String ClickSlctSize = "com.sssports.sssports:id/addToBag";
	WebElement ClkSize = driver.findElementById(ClickSlctSize);
	Assert.assertTrue(ClkSize.isDisplayed());
	driver.findElementById(ClickSlctSize).click();
	Thread.sleep(1000);
	
	//Size Selection
	
	String SlctSize = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup";
	WebElement Size = driver.findElementByXPath(SlctSize);
	Assert.assertTrue(Size.isEnabled());
	driver.findElementByXPath(SlctSize).click();
	Thread.sleep(1000);
	
	//Add to Bag
	
	driver.findElementById(ClickSlctSize).click();
	
	}

@Test(priority = 7)
public void Cart() throws InterruptedException
{
	driver.navigate().back();
	
	// Click on the Bag icon
	
	String MenuBag = "com.sssports.sssports:id/shoppingCartFragment";
	WebElement Bag = driver.findElementById(MenuBag);
	Assert.assertTrue(Bag.isDisplayed());
	driver.findElementById(MenuBag).click();
	Thread.sleep(1000);
	
	// Update the Quantity
	String Qty = "com.sssports.sssports:id/selectQuantity";
	WebElement QtyDrp = driver.findElementById(Qty);
	Assert.assertTrue(QtyDrp.isDisplayed());
	driver.findElementById(Qty).click();
	Thread.sleep(1000);
	
	
	String CQty = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]";
	WebElement ChQty = driver.findElementByXPath(CQty);
	Assert.assertTrue(ChQty.isDisplayed());
	driver.findElementByXPath(CQty).click();
	Thread.sleep(5000);
	
	String Checkout = "com.sssports.sssports:id/checkoutBtn";
	WebElement Chk = driver.findElementById(Checkout);
	Assert.assertTrue(Chk.isDisplayed());
	driver.findElementById(Checkout).click();
	Thread.sleep(5000);

	
	
}

@Test (priority = 8)
public void Checkout() throws InterruptedException
{  
	
	//Click on Change Button
	String ChangeAdd = "com.sssports.sssports:id/mTextViewChange";
	WebElement Chng = driver.findElementById(ChangeAdd);
	Assert.assertTrue(Chng.isDisplayed());
	driver.findElementById(ChangeAdd).click();
	Thread.sleep(3000);
	
	// Select the Address
	String SelectAdd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.FrameLayout/android.view.ViewGroup";
	WebElement SlctAdd = driver.findElementByXPath(SelectAdd);
	Assert.assertTrue(SlctAdd.isDisplayed());
	driver.findElementByXPath(SelectAdd).click();
	
	
	//Apply the Address
	String Apply = "com.sssports.sssports:id/btnApply";
	WebElement Aply = driver.findElementById(Apply);
	Assert.assertTrue(Aply.isDisplayed());
	driver.findElementById(Apply).click();
	Thread.sleep(3000);
	
	//Enter the CVV
	String txtCVV = "com.sssports.sssports:id/CVVText";
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).resourceId("+txtCVV +")").click();
	driver.findElementById(txtCVV).sendKeys("123");
	Thread.sleep(5000);
	
	//Scroll Down to Bottom
	 action =new TouchAction(driver);	
	 Dimension size	=driver.manage().window().getSize();
	 
	 int width=size.width;
	 int height=size.height;				
	 int middleOfX=width/2;
	 int startYCoordinate= (int)(height*.9);
	 int endYCoordinate= (int)(height*.05);
	 
	 action.press(PointOption.point(middleOfX, startYCoordinate))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	 .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	 
	 //Selecting the Toggle Button for COD
	 String COD = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.RelativeLayout/android.widget.TextView[1]";
	 WebElement ToggleCOD = driver.findElementByXPath(COD);
		Assert.assertTrue(ToggleCOD.isDisplayed());
		driver.findElementByXPath(COD).click();
		Thread.sleep(3000);
		
	 String PCode = "com.sssports.sssports:id/promoFieldContent";
	 WebElement Promo = driver.findElementById(PCode);
			Assert.assertTrue(Promo.isDisplayed());
			driver.findElementById(PCode).sendKeys("APP25");
			Thread.sleep(3000);	
			
	String PAdd = "com.sssports.sssports:id/addButton";
	WebElement AddP = driver.findElementById(PAdd);
					Assert.assertTrue(AddP.isDisplayed());
					driver.findElementById(PAdd).click();
					Thread.sleep(3000);			
}

    




   // extent.endTest(test);


}
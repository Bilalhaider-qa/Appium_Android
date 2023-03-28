package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	ExtentHtmlReporter htmlReporter;
	ExtentReports Report;
	
	@BeforeSuite
	public void ReportSetup()
	{		
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		 Report = new ExtentReports();
		 Report.attachReporter(htmlReporter);
	}
	@AfterSuite
	public void ReportTeardown()
	{
		Report.flush();
	}

}

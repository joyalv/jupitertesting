package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	ExtentReports extent;
	
	public ExtentReports getExtentReport(){
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Web Automation Results");
		
		 extent=new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Joyal");
		 return extent;
		
	}
	
	
	
}

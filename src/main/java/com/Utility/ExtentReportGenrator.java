package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	 static ExtentReports extent;
	public static ExtentReports getReports() {
		//
		String reportpath=System.getProperty("user.dir")+"\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch_8_9 Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Test Project");
		extent.setSystemInfo("Module Name", "Test Module");
		extent.setSystemInfo("O.S.", "Window");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
	}
}

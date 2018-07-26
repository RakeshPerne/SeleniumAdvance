package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener{
	ExtentTest t;
	ExtentReports r;// declaring r

	@Override
	public void onFinish(ITestContext arg0) {
		r.endTest(t);
		r.flush();
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {	
		//System.out.println("Test started");
		r= new ExtentReports("C:\\Rakesh\\Eclipse Workspace\\MyFramework\\src\\test\\java\\Myreports.html");//intializing r
		r.addSystemInfo("user ","rakesh");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//System.out.println("Test Failed");
		t.log(LogStatus.INFO ,result.getMethod().getMethodName()+ " has failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		t=r.startTest(result.getMethod().getMethodName()+ " has started");
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		t.log(LogStatus.INFO ,result.getMethod().getMethodName()+ " has started");
		//System.out.println("Test Passed");
		
	}

}

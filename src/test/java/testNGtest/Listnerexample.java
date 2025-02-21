package testNGtest;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnerexample implements ITestListener{

	public void onStart(ITestContext context) {
		System.out.println("test on start");
	}
	public void onFinish(ITestContext context) {
		System.out.println("test on finish");
	}
	public void onTestStart(ITestContext context) {
		System.out.println("test onFinish");
	}
	public void onTestSuccess(ITestContext context) {
		System.out.println("test onTestSuccess");
	}
}
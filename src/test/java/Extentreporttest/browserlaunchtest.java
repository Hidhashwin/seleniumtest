package Extentreporttest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserlaunchtest {

	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter extentSparkReporter;
	ExtentTest testcase;

	@Test
	public void launchgoogle() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		testcase=extentReport.createTest("verify google title");
		testcase.log(Status.INFO, "Navigating to google");
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Google")) {
			testcase.log(Status.PASS, "Title is matching");
		}else {
			testcase.log(Status.FAIL, "Title is not matching");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("google.png"));
			testcase.addScreenCaptureFromPath("bing.png");
		}
		Thread.sleep(1000);
		System.out.println(title);
	}

	@Test
	public void Launchbing() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		testcase=extentReport.createTest("verify bing title");
		testcase.log(Status.INFO, "Navigating to bing");
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		String title1=driver.getTitle();
		System.out.println(title1);
		if(title1.equalsIgnoreCase("Microsoft Bing")) {
			testcase.log(Status.PASS, "Title is matching");
		}else {
			testcase.log(Status.FAIL, "Title is not matching");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("bing.png"));
			testcase.addScreenCaptureFromPath("bing.png");
		}
		Thread.sleep(1000);
		
	}

	@BeforeSuite
	public void launchbrowser() {
		extentReport=new ExtentReports();
		extentSparkReporter=new ExtentSparkReporter("Extentreport.html");
		extentReport.attachReporter(extentSparkReporter);
		
		driver = new ChromeDriver();

	}

	@AfterSuite
	public void teardown() {
		driver.close();
		extentReport.flush();
	}

}

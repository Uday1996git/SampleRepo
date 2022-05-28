package SampleReport;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;
import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass {
	static WebDriver Driver;
	//static ExtentReports extent;
	//static ExtentTest logger;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		ExtentXReporter extentxReporter = new ExtentXReporter("user.dir"+"C:\\Users\\udayj\\Jar Files\\ExtentReport-output");
		ExtentReports extent = new ExtentReports();
	
		extent.attachReporter(extentxReporter);
		ExtentTest logger = extent.createTest("Google search");
		logger.log(Status.INFO, "Starting the test");
		Driver.get("https://www.google.com/");
		logger.pass("Navigated to Google.com");
		Driver.findElement(By.name("q")).sendKeys("Automation");
		logger.pass("Enterd the text in search box");
		Driver.findElement(By.name("btnk")).click();
		logger.pass("Pressed enter key");
		//TakesScreenshot scrShot =((TakesScreenshot)Driver);
		//File SrcFile=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("");
		//FileUtils.copyFile(SrcFile, DestFile);
		Driver.close();
		Driver.quit();		
		logger.pass("closed browser");
		logger.info("Test completed");
		extent.flush(); //Need to write everytime to pull the report
		
	}
}

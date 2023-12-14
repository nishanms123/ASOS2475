package COM.ASSOS.GENERIC;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;



import io.appium.java_client.android.AndroidDriver;

public class ListnerImplementationClass implements ITestListener {
	AndroidDriver driver;
@Override
public void onTestStart(ITestResult result) {
	
}


@Override
public void onTestSuccess(ITestResult result)
{
	
}


@Override
public void onTestFailure(ITestResult result)
{
	String failedtestcase=result.getMethod().getMethodName();
	TakesScreenshot t=(TakesScreenshot)BaseAppiumClass.sdriver;
	File src=t.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+failedtestcase+".png");
	try {
		FileUtils.copyFile(src,dest);
	} 
	catch (IOException e) 
	{
		
		e.printStackTrace();
	}
	
	
}

@Override
public void onTestSkipped(ITestResult result) {
	
}

}

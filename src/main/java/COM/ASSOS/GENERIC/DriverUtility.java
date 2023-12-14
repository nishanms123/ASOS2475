package COM.ASSOS.GENERIC;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.android.AndroidDriver;

public class DriverUtility {

	AndroidDriver driver;
	
	public DriverUtility(AndroidDriver driver) {
		this.driver=driver;
	}
	public void installation() {
		driver.installApp("Path of the apk file");
		System.out.println(driver.isAppInstalled("appPackageName"));
		
	}
	public void runningAppInBackground() {
		driver.runAppInBackground(Duration.ofSeconds(20));
		System.out.println(driver.queryAppState("Package Name"));

	}
	public void uninstall() {
		driver.removeApp("com.bng.calculator"); //unistall in the mobile

	}
	
	
	public void changeOrientation() {
		ScreenOrientation s=driver.getOrientation();
		driver.rotate(s.LANDSCAPE);
	}
public void getContext() {
	Set<String> contextHandles = driver.getContextHandles();
	for(String ch:contextHandles) {
		System.out.println(ch);
	}
}
	public void switchContext() {
		driver.context("WEBVIEW_PackageName");
	}
	
	public void activateApp() {
		driver.activateApp("appPackageName");//application open in the mobile
	}
	public void deviceLockedorNot() {
		System.out.println(driver.isDeviceLocked());
	}
	
	public void openNotifications() {
		driver.openNotifications();

	}
	public void hideKeyboard() {
		driver.hideKeyboard();
	}
	
}


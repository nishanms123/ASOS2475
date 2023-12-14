package COM.ASSOS.GENERIC;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {

	AndroidDriver driver;
	public GestureUtility(AndroidDriver driver) {
		this.driver=driver;
	}
	public void longPress(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
			));
	}
	public void click(WebElement element) {
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()

			));
	}
		
		public void pinchopen(WebElement element)
		{
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) element).getId(),
				    "percent", 0.75
				));
		}
		
		public void pinchClose(WebElement element) {
			((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) element).getId(),
				    "percent", 0.75
				));
		}
		public void swipe(WebElement element ) {
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
					"elementId", ((RemoteWebElement) element).getId(),
					"direction", "left",
					"percent", 0.75
					));
			
		}
			public void swipe1(int left,int top,int width,int height) {
				((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
					    "left", 100, "top", 200, "width", 200, "height", 200,
					    "direction", "left",
					    "percent", 0.75
					));
			}
			
			public void scroll(String value) 
			{
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"));"));
			}
			
			
		
			
		public void dragAndDrop( int x,int y,WebElement element) {
			((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) element).getId(),
				    
				    "endX", x,
				    "endY", y
				));
		}
		
		
}
	


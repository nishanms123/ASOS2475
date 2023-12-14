package COM.ASSOS.OBJECTREPO;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.ASSOS.GENERIC.GestureUtility;
import io.appium.java_client.android.AndroidDriver;


public class LoginPage {
AndroidDriver driver;
@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
private WebElement countryDropDown;
@FindBy(xpath="//android.widget.TextView[@text='India']")
private WebElement SelectCountry;
@FindBy(id="com.androidsample.generalstore:id/nameField")
private WebElement  EnterNameField;
@FindBy(id="com.androidsample.generalstore:id/radioMale")
private WebElement  ClickRadioBtn;
@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
private WebElement  ClickOnLetsShopBtn;









public LoginPage(AndroidDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



public WebElement getSelectCountry() {
	return SelectCountry;
}





public WebElement getCountryDropDown() {
	return countryDropDown;
}


public WebElement getEnterNameField() {
	return EnterNameField;
}



public WebElement getClickRadioBtn() {
	return ClickRadioBtn;
}



public WebElement getClickOnLetsShopBtn() {
	return ClickOnLetsShopBtn;
}



public void loginsetup(String name,GestureUtility gutilis,String value) {
	countryDropDown.click();
	gutilis.scroll(value);
	SelectCountry.click();
	EnterNameField.sendKeys(name);
	ClickRadioBtn.click();
	ClickOnLetsShopBtn.click();
	
}

}

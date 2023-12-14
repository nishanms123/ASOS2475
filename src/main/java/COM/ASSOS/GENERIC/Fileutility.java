package COM.ASSOS.GENERIC;

import java.io.FileInputStream;

import java.util.Properties;

public class Fileutility {

	public String getCommonData(String Key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
Properties pobj=new Properties();
pobj.load(fis);
return pobj.getProperty(Key);
	}

	

}

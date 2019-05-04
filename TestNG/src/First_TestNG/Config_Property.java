package First_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Property {

	static FileInputStream fis;
	static Properties prop;
	static String proploc="C:\\Users\\admin\\workspace\\TestNG\\src\\First_TestNG\\Config_Property.properties";
	
	public static void main(String[] args) {
		
		File floc=new File(proploc);
		
		try
		{
			fis=new FileInputStream(proploc);
			prop=new Properties();
			
			prop.load(fis);
			
			String eid1=prop.getProperty("101");
			String eid2=prop.getProperty("102");
			
		}
		
		catch(FileNotFoundException e)
		{
			
			System.out.println("File not found");
		}
		
		catch(IOException e)
		{
			System.out.println("jasfjk");
		}
		
	}
	

}

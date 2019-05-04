package First_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Write {

static	FileInputStream fis;
static  FileOutputStream fos;
static	Properties prop;
static	String proploc="C:\\Users\\admin\\workspace\\TestNG\\src\\First_TestNG\\Config_Property.properties";

public static void main(String[] args) {
	File floc=new File(proploc);
	
	try
	{
		
		fis=new FileInputStream(proploc);
		fos=new FileOutputStream(proploc);
		prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("Usname","Sandeep");
		prop.setProperty("Uspass","Harshad");
		prop.setProperty("Uspass","Parag");
		
		
		String eid1=prop.getProperty("Usname");
		String eid2=prop.getProperty("Uspass");
		String eid3=prop.getProperty("Uspass");
		
		System.out.println(eid1);
		System.out.println(eid2);
		System.out.println(eid3);
		
	}
	
	catch(FileNotFoundException e)
	{
		System.out.println("File not found");
	}
	
	catch(IOException e)
	{
		System.out.println("File input/output exception");
	}

}

}

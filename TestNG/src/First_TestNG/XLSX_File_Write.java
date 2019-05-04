package First_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSX_File_Write {

	static FileInputStream fis;
	static FileOutputStream fos;
	static XSSFWorkbook xwb;
	static String src="C:\\Users\\admin\\Desktop\\XLSX_File_Write.xlsx";
	public static void main(String[] args) throws IOException {
	
		try{
		File floc=new File("C:\\Users\\admin\\workspace\\TestNG\\src\\First_TestNG\\Test5.xlsx");
				
			fis=new FileInputStream(floc);
            fos=new FileOutputStream(floc); 
			xwb=new XSSFWorkbook(fis);
			XSSFSheet sheet=xwb.getSheetAt(0);
			
			int row_count=sheet.getLastRowNum();
			
			System.out.println(row_count);
/*
			sheet.getRow(4).createCell(0).setCellValue("Sharda");
			sheet.getRow(4).createCell(1).setCellValue("Pune");
			
			
			System.out.println(sheet.getRow(4).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(4).getCell(1).getStringCellValue());
   
			
			
	*/		//xwb.write(fos);
			//xwb.close();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			e.getMessage();
			
		}
		catch(IOException e)
		{
			System.out.println("File IO problem");
			e.getMessage();
		}
		
		finally
		{
			fis.close();
			
		}
		
	}
}

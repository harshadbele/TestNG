package First_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSX_File_Read {

	static FileInputStream fis;
	static String src="C:\\Users\\admin\\Desktop\\XLSX_File_Write.xlsx";
	public static void main(String[] args) throws IOException {

		File floc=new File(src);

		fis=new FileInputStream(floc);

		XSSFWorkbook xwb=new XSSFWorkbook(fis);

		XSSFSheet sheet=xwb.getSheetAt(0);

                    
		System.out.print(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.print("||");
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());

		System.out.print(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.print("||");
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());

		System.out.print(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.print("||");
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());

		System.out.print(sheet.getRow(3).getCell(0).getStringCellValue());
		System.out.print("||");
		System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());

	}


}

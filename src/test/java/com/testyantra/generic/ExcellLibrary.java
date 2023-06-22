package com.testyantra.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellLibrary implements Autoconstant
{
	public static String getcelvalue(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fsi=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(fsi);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue ;
		
	}

}

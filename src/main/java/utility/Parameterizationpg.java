package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterizationpg 
{
	public static String parameter1(String Sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Arise\\TestData.xlsx");
		String value=WorkbookFactory.create(file).getSheet(Sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return value;
	}
	
	public static double parameter2(String Sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Arise\\TestData.xlsx");
		double value=WorkbookFactory.create(file).getSheet(Sheetname).getRow(rowno).getCell(cellno).getNumericCellValue();
		return value;
	}

}

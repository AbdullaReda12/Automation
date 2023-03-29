package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static FileInputStream fis =null;

	public FileInputStream GetFileInputStream() {

		String FilePath=System.getProperty("user.dir")+"/src/test/java/data/AUT_Data.xlsx";
		File SrcFile= new File(FilePath);
		try {
			fis=new FileInputStream(SrcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error Occured"+e.getMessage());
			System.exit(0);
		}
		return fis;
	}

	public Object[][] GetExcelData() throws IOException{

		fis=GetFileInputStream();

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		int TotalNumberOfRows=(sheet.getLastRowNum()+1);
		int TotalNumberOfColumns=4;
		String[][] arrayExcelData=new String[TotalNumberOfRows][TotalNumberOfColumns];
		for (int i = 0; i < TotalNumberOfRows; i++) {
			for (int j = 0; j < TotalNumberOfColumns; j++) {
				XSSFRow row=sheet.getRow(i);
				arrayExcelData[i][j]=row.getCell(j).toString();


			}

			wb.close();




		}
		return arrayExcelData;

	}}

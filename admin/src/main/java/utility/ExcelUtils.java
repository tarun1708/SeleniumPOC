package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet excelSheet;	
	private static XSSFWorkbook excelWorkbook;
	private static XSSFCell excelCell;
	private static XSSFRow excelRow;
	
	public static void setExcelFile(String path, String sheetName) throws Exception
	{
		try{
			
		FileInputStream excelFile= new FileInputStream(path);
		excelWorkbook= new XSSFWorkbook(excelFile);
		excelSheet=excelWorkbook.getSheet(sheetName);
		
		}
		catch (Exception e) {
			throw(e);
		}
		
	}
	
	public static String getCellData(int rownum,int colnum)throws Exception
	{
		try{
		excelCell= excelSheet.getRow(rownum).getCell(colnum);
		String cell= excelCell.getStringCellValue();
		return cell;
		}
		catch (Exception e) {
			return "";
			// TODO: handle exception
		}
	}
	
	public static void setResult(String result, int rownum, int colnum) throws Exception
	{
		try{
			//excelRow= excelSheet.getRow(rownum);
			excelCell= excelRow.createCell(rownum, colnum);
			/*if(excelCell==null)
			{
				excelCell= excelRow.getCell(colnum);
				excelCell.setCellValue(result);
				
			}
			else{*/
				excelCell.setCellValue(result);
			//}
			
			FileOutputStream fileoutput= new FileOutputStream(ConstantUtility.filePath+ConstantUtility.fileName);
			excelWorkbook.write(fileoutput);
			fileoutput.flush();
			fileoutput.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}

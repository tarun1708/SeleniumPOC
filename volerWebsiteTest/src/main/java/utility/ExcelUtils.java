package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import screenModule.CountLogic;

public class ExcelUtils {

	private static XSSFSheet excelSheet;
	private static XSSFWorkbook excelWorkbook;
	private static XSSFCell excelCell;
	private static XSSFRow excelRow;
	private static FileOutputStream fileoutput;
	
	//public static void setExcelFile(String path, String sheetName) throws Exception {
		public static void setExcelFile() throws Exception {
			
		try {
			
			/*File file = new File("/home//voler//Documents//automation//SeleniumPOC//volerWebsiteTest//src//main//java//testData//testReport.xlsx");
			FileInputStream ExcelFile = new FileInputStream(file);
			 
			// Access the required test data sheet

			excelWorkbook = new XSSFWorkbook(ExcelFile);

			excelSheet = excelWorkbook.getSheet(sheetName);*/
			
			excelWorkbook = new XSSFWorkbook();
			excelSheet=excelWorkbook.createSheet("test");
			

		} catch (Exception e) {
			throw (e);
		}

	}

	public static String getCellData(int rownum, int colnum) throws Exception {
		try {
			excelCell = excelSheet.getRow(rownum).getCell(colnum);
			String cell = excelCell.getStringCellValue();
			return cell;
		} catch (Exception e) {
			return "";
			// TODO: handle exception
		}
	}

	public static void setResult(List<String> resultArray,String carId, int rownum, int colnum) throws Exception {
		try {
			//FileInputStream excelFile = new FileInputStream(ConstantUtility.filePath + ConstantUtility.fileName);
			//XSSFWorkbook excelWorkbook = new XSSFWorkbook(excelFile);
			//XSSFSheet excelSheet = (XSSFSheet) excelWorkbook.getSheet("LoginSheet");
			 fileoutput= new FileOutputStream(ConstantUtility.filePath + ConstantUtility.fileName);
		
			List<String> listdd=new ArrayList<String>();
			for(String result1:resultArray) {
				listdd=CountLogic.countarray(result1);
			}
			excelRow =  excelSheet.createRow(rownum);
			excelRow.createCell(colnum).setCellValue(carId);
			colnum++;
			for(String result:listdd){
				
			excelCell = excelRow.createCell(colnum);
			
			 /*if(excelCell==null) { excelCell= excelRow.getCell(colnum);
			 
			 excelCell.setCellValue(result);
			 
			 
			} else{
			*/
			
			excelCell.setCellValue(result+ "hrs");
			System.out.println("printed "+result+"hrs");
			colnum++;
			excelWorkbook.write(fileoutput);
			
			}
			
			 //}
			//FileOutputStream fileoutput = new FileOutputStream(ConstantUtility.filePath + ConstantUtility.fileName);
			
			//excelWorkbook.write(fileoutput);
			fileoutput.flush();
			fileoutput.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}

package screenModule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import dbUtility.DBConfig;
import utility.ConstantUtility;
import utility.ExcelUtils;

public class AdminScreen {

	public static void execute(WebDriver driver) throws Exception {
		
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<String> avalbltyarray = new ArrayList<String>();
		ArrayList<String> carIdarray = new ArrayList<String>();
		
		String carIdResponse = null;
		String availablity = null;

		try {
			DBCollection collection = DBConfig.getMongoCollection("voler_ipms", "voler_car");
			DBCursor cursor = DBConfig.cityQuery("cityId", "TdgJBx4cSychd");
			int arrayRow = 0;
			int avlbltyCol = 0;
			ExcelUtils.setExcelFile();
			try {
				while (cursor.hasNext()) {
					
					BasicDBObject obj = (BasicDBObject) cursor.next();
					availablity = obj.getString("availabilityArray");
					carIdResponse=obj.getString("objectId");
					//availablity=cursor.curr().get("availabilityArray").toString();
					avalbltyarray.add(availablity);
					carIdarray.add(carIdResponse);
					
					for (String avlbltyArray : avalbltyarray) {
						ExcelUtils.setResult(avalbltyarray,carIdResponse, arrayRow, avlbltyCol);
						
					}
					arrayRow++;
				}
				
			} catch (Exception e) {

				System.out.println(e.getMessage());
			} finally {

				cursor.close();
			}

		} catch (Exception e) {
			
		}

	}
}

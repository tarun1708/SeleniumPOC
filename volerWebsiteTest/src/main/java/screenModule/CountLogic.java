package screenModule;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountLogic {
	

public static List<String> countarray(String availability) {

	SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	//String inputString1 = "31 07 2017";
	String inputString2 = "01 08 2017";
	long total=0;
	try {
	   // Date date1 = myFormat.parse(inputString1);
	    Date date2 = myFormat.parse(inputString2);
	    Date date3 =  new Date();
	    long diff = date3.getTime() - date2.getTime();
	    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	    total= TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)*48;
	    System.out.println(total);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
	String fromCurrentDateAvailability=availability.substring((int) total);
		char ch[] = fromCurrentDateAvailability.toCharArray();
		
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == '0') {

				count++;
			} else {

				if (count != 0) {
					list.add(count/2);
				}
				count = 0;
			}
		}

		if (count != 0) {
			list.add(count/2);
		}

		//System.out.println(list);
		List<String> strList=new ArrayList<String>(list.size());
		
		for(Integer listValue:list)
		{
			strList.add(String.valueOf(listValue));
		}
		
		return strList;
		//return list
		
		
	}


	
}

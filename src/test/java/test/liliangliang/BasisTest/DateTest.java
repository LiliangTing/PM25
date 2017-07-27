package test.liliangliang.BasisTest;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		String strDate = "2017-07-27T09:00:00Z";
		strDate = strDate.replaceAll("T", " ");
		strDate = strDate.replaceAll("Z", "");
		System.out.println(strDate);
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
		  Date gpsUTCDate = null;
		  try {
		   gpsUTCDate = formatter.parse(strDate);
		  } catch (ParseException e) {
		   e.printStackTrace();
		  }
		  SimpleDateFormat localFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  localFormater.setTimeZone(TimeZone.getDefault());
		  String localTime = localFormater.format(gpsUTCDate.getTime());
		System.err.println(localTime);
	
	}

}

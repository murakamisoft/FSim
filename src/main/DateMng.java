package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateMng {

	public String getAddDate(int i) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, i);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy'/'MM");
		return sdf1.format(cal.getTime());

	}

}

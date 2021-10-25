package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarApp {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2021-10-25T13:59:00Z"));
		
		System.out.println(dataFormat.format(d));
		
		Calendar calendario = Calendar.getInstance();
		
		
		
	}

}

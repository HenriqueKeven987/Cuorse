package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarApp {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dataEscolhida = Date.from(Instant.parse("2021-10-25T13:59:00Z"));		
		
		Calendar calendario = Calendar.getInstance();
		
		int dia = calendario.get(calendario.DAY_OF_MONTH);
		int mes = 1 + calendario.get(calendario.MONTH);
		int ano = calendario.get(calendario.YEAR);
		int hora = calendario.get(calendario.HOUR_OF_DAY);
		int minutos = calendario.get(calendario.MINUTE);
		int segundos = calendario.get(calendario.SECOND);
			
		
		System.out.println(dataFormat.format(dataEscolhida));	 
		System.out.println("----------------------------");
		System.out.println(dia + "/"+ mes + "/"+ ano+ " " + hora + ":" + minutos + ":"+ segundos);
		 
	}

}

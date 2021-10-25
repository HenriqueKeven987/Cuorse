package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		Scanner entrada = new Scanner(System.in);
		
		SimpleDateFormat dataForm1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dataForm2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data0 = new Date();     
		Date data1 = dataForm1.parse("22/10/2021");
		Date data2 = dataForm2.parse("22/10/2021 16:42:58"); 
		
		System.out.println("Data do Sistema: "+ dataForm2.format(data0));
		System.out.println("Data: "+ dataForm2.format(data1));
		System.out.println("Data: "+ dataForm2.format(data2));

		
	}

}

package Application;

import java.util.Locale;
import java.util.Scanner;

public class vectors {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Quantas Alturas Voce quer tirar a media?");
		int vezes = entrada.nextInt();
		double[] alturas = new double[vezes];
		
		
		for(int i = 0;i <= vezes;i++) {
			
			System.out.println("Digite a Altura "+ i); 
			alturas[i] = entrada.nextDouble();
		}
		
		
		entrada.close();
		
	}

}

package Application;

import java.util.Locale;
import java.util.Scanner;

public class vectors {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Locale.setDefault(Locale.US);
		
		System.out.print("Quantas Alturas Voce quer tirar a media?");
		int vezes = entrada.nextInt();
		double[] alturas = new double[vezes];
		double soma = 0;
		
		for(int i = 0;i < vezes;i++) {
			
			System.out.println("Digite a Altura "); 
			alturas[i] = entrada.nextDouble();
			soma += alturas[i];
		}
		
		double media = soma / vezes;
		
		System.out.printf("a media de altura é %.2f", media);
		
		
		entrada.close();
		
	}

}

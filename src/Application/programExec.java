package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class programExec {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos Quartos a Seram Alugados: ");
		int quartos = entrada.nextInt();
		Estudante[] estudantes = new Estudante[10];
			
		
		for(int i =0;i< quartos;i++) {
			
			System.out.print("Digite o nome do Estudante: ");
			String nome = entrada.next();
			System.out.print("Digite o Email do Estudante: ");
			String email = entrada.next();
			System.out.print("Digite o numero do quarto: ");
			int quarto = entrada.nextInt();
			System.out.println("--------------------------");
			
			estudantes[quarto] = new Estudante(nome,email,quarto);		
		}
		
		for(int i = 0;i< 10;i++) {
			if(estudantes[i]!= null) {
				System.out.println(estudantes[i]);
			}
		}
		
		
		entrada.close();
				

	}

}

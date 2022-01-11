package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Trabalhador;

public class ProgramTrabalhador {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Digite o Departamento do Coolaborador: ");
		System.out.println("Entre com os dados do Coolaborador: ");
		String nome = entrada.next();
		System.out.println("Entre com o Nivel do Coolaborador: ");
		int nivel = entrada.nextInt();
		System.out.println("Qual  o salario base: ");
		double salarioBase = entrada.nextDouble(); 
		
		
		
		
		
		entrada.close();

	}

}

package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;

public class ProgramTrabalhador {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Departamento do Coolaborador: ");
		Departamento dep = new Departamento(entrada.next());
		
		
		
		
		entrada.close();

	}

}

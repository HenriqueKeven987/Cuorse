package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Academico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do Aluno: ");
		aluno.nome = entrada.nextLine();
		
		System.out.print("Digite a Nota 1:");
		aluno.nota1 = entrada.nextDouble();
		
		System.out.print("Digite a Nota 2: ");
		aluno.nota2 = entrada.nextDouble();
		
		System.out.print("Digite a Nota 3: ");
		aluno.nota3 = entrada.nextDouble();
		
		aluno.mediaAluno();
		
		
		

	}

}

package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class funcionarioProgram {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero de funcionarios para cadastro: ");
		int vezes = entrada.nextInt();
		funcionario[] funcionario = new funcionario[vezes]; 
		
		
		for (int i = 0; i < vezes; i++) {
			System.out.print("id: ");
			int id = entrada.nextInt();
			
			System.out.print("Nome: ");
			String nome = entrada.next();
						
			System.out.print("Salario: ");
			double salario = entrada.nextDouble();
						
			funcionario[i] = new funcionario(id, nome, salario);		
			System.out.println("---------------------------");
						
		}
		
		System.out.print("Entre com o id do funcionario a ser aumentado: ");
		int id = entrada.nextInt(); 
		
		for (int i = 0;i < vezes;i++) {
			
			if(funcionario[i].getId() == id) {
				System.out.print("Digite a porcetagem a ser aumentada: ");
				double porcetagem = entrada.nextDouble();
				funcionario[i].aumentarSalario(porcetagem);
			}
			
		}
		
		System.out.println("Lista de Coolaboradores: ");
		
		for (int i =0; i< vezes; i++) {			
			System.out.println(funcionario[i]);
		}
		
		
		entrada.close();

	}

}

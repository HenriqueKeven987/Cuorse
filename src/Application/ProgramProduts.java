package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produts;

public class ProgramProduts {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int vezes = 0;
		
		System.out.print("Digite o numero de produtos a ser Add:");
		vezes = entrada.nextInt();
		  
		Produts[] vecProdutos = new Produts[vezes]; 
		
		for (int i =0;i < vezes;i++) {
			System.out.print("Coloque o nome: ");
			String nome = entrada.next();
			System.out.print("Coloque o preço: ");
			double preco = entrada.nextDouble();			
			vecProdutos[i] = new Produts(nome, preco);
			System.out.println("---------------");
			
		}
		
		double soma = 0.0;
		for (int i =0;i< vezes;i++) {
			soma += vecProdutos[i].getPrice();
		}
		
		double media = soma / vezes;
		System.out.printf("Media dos Produtos: %.2f", media);
		
		
	}
	
}

package Application;

import java.util.Scanner;

public class ApplicationMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo a Matriz");
		System.out.print("Digite o valor de Linhas: ");
		int linhas = entrada.nextInt();
		System.out.print("Digite o valor de Colunas: ");
		int colunas = entrada.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		for(int x = 0; x < linhas;x++) {
			for(int y = 0; y < colunas;y++) {
				System.out.print("Valor na linha "+ x + " e coluna " + y + ":");
				matriz[x][y] = entrada.nextInt();
			}
		}
		
		
		System.out.print("Digite o valor a ser consultado: ");
		int busca = entrada.nextInt();
		
		for (int x = 0;x < linhas ;x++) {
			for (int y = 0; y < colunas ;y++) {
				if(matriz[x][y] == busca) {
					
					System.out.println("Posição: "+ x + ","+ y +": ");
					if(x > 0) {
						System.out.println("Cima: "+ matriz[x-1][y]);
					}
					if(y > 0) {
						System.out.println("esquerda: "+ matriz[x][y-1]);
					}
					
					if(x < linhas) {
						System.out.println("Direita: "+ matriz[x+1][y]);
					}
					if(y < colunas) {
						System.out.println("Baixo: "+ matriz[x][y+1]);
					}
					
				}
			}
		}
		
		
		entrada.close();
		
		
	}

}

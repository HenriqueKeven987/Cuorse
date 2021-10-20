package Application;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationMatrizes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("quantas colunas e linhas vai ter sua matriz: ");
		int colunasLinhas = entrada.nextInt();
		
		int[][] matriz = new int[colunasLinhas][colunasLinhas];
		
		for(int x = 0; x < colunasLinhas; x++) {
			for (int y = 0; y < colunasLinhas; y++) {
				System.out.print("Posicao Matriz Linha " + x + " Coluna "+ y + ": ");
				matriz[x][y] = entrada.nextInt();
			}
		}
		System.out.print("Coluna Principal: ");
		for(int i = 0; i< colunasLinhas; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		System.out.print("Numeros negativos: ");
		for(int x = 0; x < colunasLinhas; x++) {
			for(int y =0; y < colunasLinhas; y++) {
				if(matriz[x][y] < 0) {
					System.out.print(matriz[x][y]+ " ");
				}
			}
		}
		
		entrada.close();
		
	}

}

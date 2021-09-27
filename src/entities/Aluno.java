package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void mediaAluno () {		
		
		double media = nota1 + nota2 + nota3;
		double mediaPass = 60.0;
		
		if(media >= 60.0) {
			System.out.println("Aluno: "+ nome);
			System.out.println(" Nota Final: "+ media + "Aprovado");			
		}else {
			System.out.println("Aluno: "+ nome);
			System.out.println(" Nota Final: "+ media);
			media = mediaPass - media;
			System.out.println("Reprovado Faltou " + media);
		}
		
		return;
	}
	
	
	
}

package entities;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double desc;
	
	
	public double descSalario() {
		
		return salarioBruto - desc;
	}
	
	
	public void acrecimoSalario(double porcentagem) {
				
		salarioBruto += salarioBruto * porcentagem / 100;
		
	}
	
	public String toString() {
		
		return "Empregado: " + nome + " $" + String.format("%.2f",descSalario());
			
	}
	
}

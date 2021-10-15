package entities;

public class funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	public funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void aumentarSalario(double porcetagem) {
		this.salario += (this.salario / 100)*porcetagem; 
	}
	
	public String toString() {
		return this.id + ", " + this.nome + ", " + this.salario;
	}
	
}

package entities;

public class Retangulo {
	
	//atributos
	public double altura;
	public double largura;
	
	//metodos
	public String area() {
		
		return String.format("%.2f",altura * largura);
	}
	
	public String perimetro() {
		
		return String.format("%.2f",(altura + largura) * 2);
	}
	
	public String diagonal() {
		
		return String.format("%.2f",Math.sqrt(largura * largura + altura * altura));
	}
	
	
}

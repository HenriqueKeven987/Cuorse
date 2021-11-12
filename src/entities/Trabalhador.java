package entities;

import java.util.List;

import entities.enums.NivelTrabalho;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalho nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHora> Contratos;
	
	public Trabalhador() {
		
	}
	
	public Trabalhador(String nome, NivelTrabalho nivel, Double salarioBase, Departamento departamento,
			List<ContratoHora> contratos) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
		Contratos = contratos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return Contratos;
	}

	public void setContratos(List<ContratoHora> contratos) {
		Contratos = contratos;
	}
	
	
	
	
	
	
	
}

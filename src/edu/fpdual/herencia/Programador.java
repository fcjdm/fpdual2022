package edu.fpdual.herencia;

public class Programador extends Empleado{
	
	int lineasDeCodigoPorHora;
	String lenguajeDominante;
	
	public Programador(){
	
	}
	
	public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){
		super(nombre, cedula, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
}
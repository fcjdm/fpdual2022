package edu.fpdual.herencia;

public class Empleado{
	protected String nombre;
	protected String cedula;
	protected int edad;
	protected boolean casado;
	protected double salario;
	
	public Empleado(){
	
	}
	
	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario){
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public void mostrarClasi(){
		if (edad <= 21){
			System.out.println("Principiante");
		}else if (edad >= 22 && edad <= 35){
			System.out.println("Intermedio");
		}else{
		System.out.println("Senior");
		}
		
	}
	
	public void mostrarDatos(){
		System.out.println("Nombre: " + nombre + "\n cedula: " + cedula + "\n Edad: " + edad + "\n Casado: " + casado + "\n Salario: " + salario);
	}
	
	public void incrementarSalario (int porcentaje){
		double incremento = salario * porcentaje;
		this.salario += incremento;
	}
}
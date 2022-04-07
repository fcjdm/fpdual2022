package edu.fpdual.objetos;

public class Empleado{
	
	private String nombreEmpleado;
	private int edad;
	private String ciudad;
	
	public Empleado (String nombre, int edad, String ciudad){
		this.nombreEmpleado = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
	}
	
	public String getNombre(){
		return nombreEmpleado;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public String getCiudad(){
		return ciudad;
	}

}
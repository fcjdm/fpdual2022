package edu.fpdual.objetos;

public class Saludo{
	private String saludo;
	
	public Saludo(String saludo){
		this.saludo = saludo;
	}
	
	public void saludar(){
		System.out.println("Hola " + saludo);
	}
	
	public void setSaludo(String saludo){
		this.saludo = saludo;
	}
	
	public static void main(String[] args){
		Saludo s1 = new Saludo("Pepe");
		s1.saludar();
		s1.setSaludo("Juan");
		s1.saludar();
	}
	
}
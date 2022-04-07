package edu.fpdual.excepciones;

public class Excepciones6{
	public static void f(){
		try{
			g();
		}catch(Exception e){
			System.out.println("Hay una primera excepcion");
			throw new RuntimeException(e);
		}
	}
	
	public static void g() throws Exception{
		throw new Exception ("Hola, soy una excepcion");
	}
	
	public static void main (String[] args){
		try{
			f();
		}catch(RuntimeException e){
			System.out.println(e);
		}
	}
}
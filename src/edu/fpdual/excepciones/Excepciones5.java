package edu.fpdual.excepciones;

public class Excepciones5 {
	public static void f() throws ExcepcionPersonal {
		try{
			g();
		}catch(Exception e){
			System.out.println("Hay una primera excepcion");
			throw new ExcepcionPersonal("Soy la segunda excepcion");
		}
	}
	
	public static void g() throws Exception{
		throw new Exception ("Hola, soy una excepcion");
	}
	
	public static void main (String[] args){
		try{
			f();
		}catch(ExcepcionPersonal e){
			System.out.println("Hay una segunda excepcion");
		}
	}
}
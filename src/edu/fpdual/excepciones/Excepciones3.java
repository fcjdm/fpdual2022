package edu.fpdual.excepciones;

public class Excepciones3{
	public static void sacarExcepcion() throws ExcepcionPersonal{
			throw new ExcepcionPersonal("Error en la nube");
		}
	
	public static void main(String[] args){
		
		try{
			sacarExcepcion();
		}catch (ExcepcionPersonal e){
			System.out.println(e);
		}
	}

}
package edu.fpdual.excepciones;

public class Excepciones1{
	public static void main(String[] args){
		try{
			throw new Exception("Esto es una excepcion");
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Se creó la excepcion");
		}
		
	}
}
package edu.fpdual.excepciones;

public class Excepciones4{
	
	
	public static void main (String[] args){
		String palabra= null;
		try{
			palabra.toString();
		}catch (NullPointerException e){
			System.out.println("Ese objeto es nulo");
		}
	
	}
}
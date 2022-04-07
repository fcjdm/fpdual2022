package edu.fpdual.excepciones;

public class Excepciones8{
	public static void main (String[] args){
		String newArray[] = new String [10];
		
		try{
			System.out.println(newArray[-1]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Se te fue amigo");
		}
	}
}
package edu.fpdual.objetos;

public class PalabrasConcate{
	
	public static void main(String[]args){
		
		imprimir(args);
		
	}
	
	public static void imprimir(String[] palabras){
			
			for (int i = 0; i < palabras.length; i++){
			System.out.println(palabras[i]);
			}
		}
}
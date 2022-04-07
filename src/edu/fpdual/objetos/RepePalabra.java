package edu.fpdual.objetos;

public class RepePalabra{
	
	public static void main(String[]args){
		
		imprimir(args[0], Integer.parseInt(args[1]));
		
	}
	
	public static void imprimir(String palabra, int repeticiones){
			
			for (int i = 1; i <= repeticiones; i++){
			System.out.println(palabra);
			}		
		}
}

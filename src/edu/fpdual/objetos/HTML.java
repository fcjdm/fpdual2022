package edu.fpdual.objetos;

public class HTML{
	
	public static void main(String[]args){
		
		imprimir(args[0], args[1]);
		
	}
	
	public static void imprimir(String etiqueta, String palabra){
			
			System.out.println("<"+etiqueta+">"+palabra+"</"+etiqueta+">");
		}
}
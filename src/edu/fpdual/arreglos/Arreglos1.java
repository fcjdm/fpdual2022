package edu.fpdual.arreglos;

import java.util.ArrayList;
public class Arreglos1 {
	public static void main (String[] args){
		int[] arrayNum = new int [3];
		
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		
		arrayNum[0] = 6;
		System.out.println(compruebaArray(arrayNum));
		
		listaNum.add(0);
		System.out.println(compruebaLista(listaNum));
		
		
	}
	
	public static boolean compruebaArray(int[] a){
		boolean tieneSeis = false;
		if(a[0] == 6 || a[a.length - 1] == 6){
			tieneSeis = true;
		}
		
		return tieneSeis;
	}
	
	public static boolean compruebaLista(ArrayList<Integer> l){
		boolean tieneSeis = false;
		if( l.get(0) == 6 | l.get(l.size() - 1) == 6){
			tieneSeis = true;
		}
		
		return tieneSeis;
	}
}
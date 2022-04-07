package edu.fpdual.arreglos;

import java.util.ArrayList;
public class Arreglos2{
	public static void main (String[] args){
		int[] arrayNum = new int [3];
		
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		
		arrayNum[0] = 2;
		System.out.println(compruebaArray(arrayNum));
		
		listaNum.add(0);
		System.out.println(compruebaLista(listaNum));
		
		
	}
	
	public static boolean compruebaArray(int[] a){
		boolean tieneSeis = false;
		for (int i = 0; i < a.length; i++){
			if ( a[i] == 2 || a[i] == 3){
				tieneSeis=true;
			}
		}
		
		return tieneSeis;
	}
	
	public static boolean compruebaLista(ArrayList<Integer> l){
		boolean tieneSeis = false;
		if ( l.contains(2) || l.contains(3)){
			tieneSeis=true;
		}
		return tieneSeis;
	}
}
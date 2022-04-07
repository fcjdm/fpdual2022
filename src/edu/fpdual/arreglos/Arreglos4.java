package edu.fpdual.arreglos;

import java.util.Arrays;

public class Arreglos4 {
	public static void main (String[] args){
		int[] arrayNum = {1, 2, 3, 4};
		
		
		System.out.println(Arrays.toString(rellenaArray(arrayNum)));
		
	}
	
	public static int[] rellenaArray(int[] a){
		int[] nuevoArray = new int[a.length];
		int pos = 0;
		for (int i = a.length -1; i >= 0; i--){
			nuevoArray[pos] = a[i];
			pos++;
		}
		
		return nuevoArray;
	}
}
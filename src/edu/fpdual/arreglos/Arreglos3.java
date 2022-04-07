package edu.fpdual.arreglos;

import java.util.Arrays;
public class Arreglos3{
	public static void main (String[] args){
		int[] arrayNum = {1, 2, 3, 4, 5, 6};
		
		System.out.println(Arrays.toString(compruebaArray(arrayNum)));
		
	}
	
	public static int[] compruebaArray(int[] a){
		int[] nuevoArray = new int[2];
		if(a.length % 2 == 0){
			int posCentral = (a.length / 2) - 1;
			
			for (int i = posCentral, pos = 0; i <= posCentral + 1; i++, pos++){
				nuevoArray[pos] = a[i];
			}
		}
		
		return nuevoArray;
	}
}
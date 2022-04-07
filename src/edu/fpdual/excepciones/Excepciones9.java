package edu.fpdual.excepciones;

public class Excepciones9{
	
	public static void main(String[] args) {
		String newArray[] = new String [10];
		int x = -3;
		boolean noHayExcepcion = false;
		while (noHayExcepcion == false){
			try{
				System.out.println(newArray[x]);
				noHayExcepcion = true;
			}catch (IndexOutOfBoundsException e){
				System.out.println("Fuera de rango bro");
				x++;
			}
		}
	}
}
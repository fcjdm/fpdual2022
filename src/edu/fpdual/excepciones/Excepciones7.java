package edu.fpdual.excepciones;

public class Excepciones7{
		
	
	public static void main (String[] args){
		try{
			repartidorExcepciones(1);
		}catch(ExcepcionUno | ExcepcionDos | ExcepcionTres e){
			System.out.println(e);
		}
	}
	
	public static void repartidorExcepciones(int num) throws ExcepcionUno, ExcepcionDos, ExcepcionTres{
		if(num < 0){
			throw new ExcepcionUno("Numero menos que 0");
		}else if (num > 0){
			throw new ExcepcionDos("Numero mayor que 0");
		}else{
			throw new ExcepcionTres("El numero es 0");
		}
	}

}

class ExcepcionUno extends Exception{
	public ExcepcionUno (String msg){
		super(msg);
	}
}

class ExcepcionDos extends Exception{
	ExcepcionDos (String msg){
			super(msg);
		}
}

class ExcepcionTres extends Exception{
	ExcepcionTres (String msg){
			super(msg);
		}
}
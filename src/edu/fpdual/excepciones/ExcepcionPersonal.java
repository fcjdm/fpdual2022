package edu.fpdual.excepciones;

public class ExcepcionPersonal extends Throwable{
	
	public ExcepcionPersonal (String mensaje){
		super(mensaje);
	}
	
	@Override
	public String getMessage(){
		return super.getMessage();
	}
	
	
}
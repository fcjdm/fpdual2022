package edu.fpdual.herencia;

public class PCongelado extends Producto{
	private int temperatura;
	private String tipo;
	
	public PCongelado (String fechaCaducidad, int numLote, int temperatura, String tipo){
		super(fechaCaducidad, numLote);
		this.temperatura = temperatura;
		this.tipo = tipo;
	}
	
	public int getTemperatura(){
		return temperatura;
	}
	
	public String tipo(){
		return tipo;
	}
	
	@Override
	public String getFechaCaducidad(){
		return fechaCaducidad;
	}
	
	@Override
	public int getNumLote(){
		return numLote;
	}
}
package edu.fpdual.herencia;

public abstract class Producto{
	protected String fechaCaducidad;
	protected int numLote;
	
	public Producto (String fechaCaducidad, int numLote){
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
	}
	
	public String getFechaCaducidad(){
		return fechaCaducidad;
	}
	
	public int getNumLote(){
		return numLote;
	}
}
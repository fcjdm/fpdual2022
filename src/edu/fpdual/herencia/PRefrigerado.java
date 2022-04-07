package edu.fpdual.herencia;

public class PRefrigerado extends Producto{
	private int temperaturaRecomen;
	
	public PRefrigerado (String fechaCaducidad, int numLote, int temperaturaRecomen){
		super(fechaCaducidad, numLote);
		this.temperaturaRecomen = temperaturaRecomen;
	}
	
	public int getTemperaturaRecomen(){
		return temperaturaRecomen;
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
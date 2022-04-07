package edu.fpdual.herencia;

public class PFresco extends Producto{
	private String fechaCreacion;
	
	public PFresco (String fechaCaducidad, int numLote, String fechaCreacion){
		super(fechaCaducidad, numLote);
		this.fechaCreacion = fechaCreacion;
	}
	
	public String getFechaCreacion(){
		return fechaCreacion;
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
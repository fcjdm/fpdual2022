package edu.fpdual.herencia;

import java.util.ArrayList;

public abstract class Envio{
	protected String origen;
	protected String destino;
	protected ArrayList<Producto> cestaProductos;
	
	public Envio (String origen, String destino){
		this.origen = origen;
		this.destino = destino;
		cestaProductos = new ArrayList<Producto>();
	}
	
	public String getOrigen(){
		return origen;
	}
	
	public String getDestino(){
		return destino;
	}
	
	public void anyadirProducto(Producto p){
		cestaProductos.add(p);
	}
	
	public ArrayList getCesta(){
		return cestaProductos;
	}

}
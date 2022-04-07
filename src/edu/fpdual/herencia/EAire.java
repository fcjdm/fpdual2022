package edu.fpdual.herencia;

import java.util.ArrayList;

public class EAire extends Envio{
	protected int peso;
	
	public EAire (String origen, String destino, int peso){
		super(origen,destino);
		this.peso = peso;
	}
	
	public int getPeso(){
		return peso;
	}
	
	public void anyadirPeso(int peso){
		this.peso += peso;
	}
	
	public void quitarPeso(int peso){
		this.peso -= peso;
	}
	
	@Override
	public String getOrigen(){
		return origen;
	}
	
	@Override
	public String getDestino(){
		return destino;
	}
	
	@Override
	public void anyadirProducto(Producto p){
		cestaProductos.add(p);
	}
	
	@Override
	public ArrayList getCesta(){
		return cestaProductos;
	}

}
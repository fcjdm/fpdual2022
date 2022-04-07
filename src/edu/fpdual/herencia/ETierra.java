
package edu.fpdual.herencia;
import java.util.ArrayList;

public class ETierra extends Envio{
	protected String tipoV;
	
	public ETierra (String origen, String destino, String tipoV){
		super(origen,destino);
		this.tipoV = tipoV;
	}
	
	public String getTipo(){
		return tipoV;
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


package edu.fpdual.objetos;

public class Orden{
	private int numOrden;
	private Cliente cliente;
	private Empleado empleado;
	private String fecha;
	private String hora;
	private String textoOrden;
	
	public Orden (int numOrden, Cliente cliente, Empleado empleado, String fecha, String hora){
		this.numOrden = numOrden;
		this.cliente = cliente;
		this.empleado = empleado;
		this.fecha = fecha;
		this.hora = hora;
		this.textoOrden = "";
	}
	
	public int getNumOrden(){
		return numOrden;
	}
	
	public void actualizarFechaYHora(String fecha, String hora){
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public String getFecha(){
		return fecha;
	}
	
	public String getHora(){
		return hora;
	}
	
	public void introducirTextoOrden(String orden){
		this.textoOrden = orden;
	}
	
}
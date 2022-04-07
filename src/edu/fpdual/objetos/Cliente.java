package edu.fpdual.objetos;

public class Cliente{

	private int codigoCliente;
	private String nombre;
	private String ciudad;
	private float dineroCuenta;
	private boolean clienteActivo;
	
	public Cliente (int codigoCliente, String nombre, String ciudad){
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.ciudad = ciudad;
		dineroCuenta = 0.0f;
		clienteActivo = true;
	}
	
	public void anyadirSaldo (float saldo){
		dineroCuenta += saldo;
	}
	
	public void desactivarCuenta(){
		dineroCuenta = -1f;
		clienteActivo = false;
	}
	
	public int getCodigoCliente(){
		return codigoCliente;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getCiudad(){
		return ciudad;
	}
	
	public boolean isActivo(){
		return clienteActivo;
	}
	
	public static void main(String[]args){
		Cliente c1 = new Cliente (111, "Pepe", "Sevilla");
		Cliente c2 = new Cliente (222, "Maria", "Madrid");
		
		c1.anyadirSaldo(500f);
		c2.anyadirSaldo(1000f);
		c2.desactivarCuenta();
		c1.getNombre();
		
		System.out.println(c1.getNombre());
		System.out.println(c2.isActivo());
	}

}

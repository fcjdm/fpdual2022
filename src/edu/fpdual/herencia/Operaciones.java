package edu.fpdual.herencia;

public class Operaciones{
	public static void main(String[]args){
		PCongelado salmon = new PCongelado ("02/06/23", 111, -23, "Agua");
		PFresco verdura = new PFresco ("05/04/22", 222, "25/03/22");
		PRefrigerado carne = new PRefrigerado ("11/05/22", 22, 12);
		
		EAire envioAvion = new EAire("Sevilla", "Galicia", 5);
		ETierra envioCamion = new ETierra("Sevilla", "Málaga", "Camion");
		
		envioAvion.anyadirProducto(salmon);
		envioAvion.anyadirProducto(carne);
		
		System.out.println(envioAvion.getCesta());
		
	}
} 
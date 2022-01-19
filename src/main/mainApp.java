package main;

import objetos.Electrodomesticos;

public class mainApp {

	public static void main(String[] args) {
		// . Crearemos una clase llamada Electrodomestico con las siguientes características:
//		• Sus atributos son precio base, color, consumo energético (letras entre A y F) ypeso. 
//		Indica que se podrán heredar.
//		• Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 
//		100 € y el peso de 5 kg. Usa constantes para ello.
//		• Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre 
//		esta en mayúsculas o en minúsculas.
//		• Los constructores que se implementaran serán
//		o Un constructor por defecto.
//		o Un constructor con el precio y peso. El resto por defecto.
//		o Un constructor con todos los atributos.

		Electrodomesticos elec1 = new Electrodomesticos();
		Electrodomesticos elec2 = new Electrodomesticos(200, 12.4);
		Electrodomesticos elec3 = new Electrodomesticos(200, "negro", 'A', 12.4);
		Electrodomesticos elec4 = new Electrodomesticos(200, "amarillo", 'A', 12.4);
		
		System.out.println(elec1.toString());
		System.out.println(elec2.toString());
		System.out.println(elec3.toString());
		System.out.println(elec4.toString());
		System.out.println();
		
		elec1.precioFinal();
		elec2.precioFinal();
		elec3.precioFinal();
		elec4.precioFinal();

		System.out.println(elec1.toString());
		System.out.println(elec2.toString());
		System.out.println(elec3.toString());
		System.out.println(elec4.toString());
	}

}

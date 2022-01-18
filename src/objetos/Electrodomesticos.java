package objetos;

import java.util.ArrayList;

public class Electrodomesticos {
	
	private final double PRECIO = 100;
	private final String COLOR = "blanco";
	private final char CONSUMO = 'F';
	private final double PESO = 5;

	private double precio;
	private String color;
	private char consumo;
	private double peso;
	
	public Electrodomesticos() {
		this.precio = PRECIO;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomesticos(double precio, double peso) {
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomesticos(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		this.color = comprobarColor(color);
		this.consumo = consumo;
		this.peso = peso;
	}
	
	private String comprobarColor(String color) {
		String colorUsuario = color;
		
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("blanco");
		colores.add("negro");
		colores.add("rojo");
		colores.add("azul");
		colores.add("gris");
		
		boolean salir = false;
		int contador = 0;
		int sizeColores = colores.size()-1;
		// Hago un bucle que recorre el arraylist comprobando si el color introducido
		// es un color valido, una vez lo encuentra hace un return del color, si no
		// lo encuentra pone el color por defecto
		do  {
			if(colores.get(contador).equalsIgnoreCase(colorUsuario)) {
				color = colorUsuario;
				salir = true;
			} else {
				color = COLOR;
			}
			contador++;
		} while (!salir && contador < sizeColores);
		
		return color;
	}

	@Override
	public String toString() {
		return "Electrodomesticos: precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + "]";
	}
	
	
	
}

package main;

import objetos.Electrodomesticos;
import objetos.Lavadora;
import objetos.Television;

public class mainApp {

	public static void main(String[] args) {

		//Crea un array de Electrodomesticos de 10 posiciones.

		Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];

		//Asigna a cada posición un objeto de las clases anteriores con los valores que
		//desees.

		electrodomesticos[0] = new Lavadora(200, "amarillo", 'J', 12.4, 40);
		electrodomesticos[1] = new Television(250, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[2] = new Lavadora(160, "amarillo", 'J', 12.4, 20);
		electrodomesticos[3] = new Lavadora(560, "amarillo", 'J', 12.4, 15);
		electrodomesticos[4] = new Television(650, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[5] = new Lavadora(756, "amarillo", 'J', 12.4, 25);
		electrodomesticos[6] = new Television(675, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[7] = new Television(234, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[8] = new Lavadora(545, "amarillo", 'J', 12.4, 55);
		electrodomesticos[9] = new Television(356, "amarillo", 'J', 12.4, 41, true);

		//Ahora, recorre este array y ejecuta el método precioFinal

		int contTelevisiones = 0;
		int contLavadoras = 0;
		double sumaTotal = 0;

		for (int i = 0; i < electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();
			sumaTotal += electrodomesticos[i].getPrecio();

			if (electrodomesticos[i] instanceof Television) {
				contTelevisiones++;

			} else {
				contLavadoras++;
			}
		}

		Television[] televisiones = new Television[contTelevisiones];
		Lavadora[] lavadoras = new Lavadora[contLavadoras];

		contTelevisiones = 0;
		contLavadoras = 0;

		for (int i = 0; i < electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();

			if (electrodomesticos[i] instanceof Television) {
				televisiones[contTelevisiones] = (Television) electrodomesticos[i];
				contTelevisiones++;

			} else {
				lavadoras[contLavadoras] = (Lavadora) electrodomesticos[i];
				contLavadoras++;
			}
		}

		for (int i = 0; i < lavadoras.length; i++) {
			System.out.println("El precio de la lavadora " + i + " es: " + lavadoras[i].getPrecio());
		}

		System.out.println("------");

		for (int i = 0; i < televisiones.length; i++) {
			System.out.println("El precio de la television " + i + " es: " + televisiones[i].getPrecio());
		}

		//Deberás mostrar el precio de cada clase, es decir, el precio de todas las
		//televisiones por un lado, el de las lavadoras por otro y la suma de los
		//Electrodomesticos (puedes crear objetos Electrodomestico , pero recuerda que
		//Television y Lavadora también son electrodomésticos). Recuerda el uso operador
		//instanceof

		//Por ejemplo, si tenemos un
		//Electrodomestico con un precio final de 300, una
		//lavadora de 200 y una televisión de 500, el resultado final sera de 1000
		//(300+200+500) para electrodomésticos, 200 para lavadora y 500 para television.
		System.out.println("------");
		System.out.println("Suma total de todos los electrodomesticos = " + sumaTotal);

	}
}

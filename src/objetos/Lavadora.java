package objetos;

public class Lavadora extends Electrodomesticos {

	private final int CARGA = 5;

	private int carga;

	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	public Lavadora(int precio, double peso) {
		super(precio, peso);
		this.carga = CARGA;
	}

	public Lavadora(double precio, String color, char consumo, double peso, int carga) {
		super(precio, color, consumo, precio);
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", toString()=" + super.toString() + "]";
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.precio = this.precio + 50;
		}
	}
}

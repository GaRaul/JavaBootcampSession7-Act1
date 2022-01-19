package objetos;

public class Television extends Electrodomesticos{

	private final int PULGADAS = 20;
	private final boolean SINTONIZADORTDT = false;
	
	private int pulgadas;
	private boolean sintonizadorTDT;
	
	public Television() {
		super();
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	public Television(double precio, double peso) {
		super(precio, peso);
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	public Television(double precio, String color, char consumo, double peso, int pulgadas, boolean sintonizadorTDT) {
		super(precio, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public void precioFinal() {
		
		super.precioFinal();
		// Le sumo un % al precio de lavadora
		if (this.pulgadas > 40) {
			this.precio *= 1.30;
		}
		
		if (this.sintonizadorTDT) {
			this.precio += 50;
		}
	}

	
	
	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + ", precio=" + precio
				+ ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + "]";
	}
	
	
	
}

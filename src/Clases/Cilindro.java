package Clases;

public class Cilindro {
	int radio;
	int altura;
	
	/**
	 * Recibe dos numeros enteros y los mete uno dentro de radio y el otro en altura
	 * @param radio
	 * @param altura
	 */
	public Cilindro(int radio, int altura) {
		this.radio = radio;
		this.altura = altura;
	}
	/**
	 * Al crear un cilindro se les pone a radio y a altura 1 por defecto
	 */
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}
	/**
	 * Calcula la superficie del cilindro y devuelve el total
	 * @return double
	 */
	public double superficie() {
		double total = 2*3.14*radio*radio+2*3.14*radio*altura;
		return total;
	}
	/**
	 * Calcula el volumen del cilindro y devuelve el total
	 * @return double
	 */
	public double volumen() {
		double total = 3.14*radio*radio*altura;
		return total;
	}
}

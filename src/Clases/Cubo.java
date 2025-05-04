package Clases;

public class Cubo {
	int lado;
	
	/**
	 * Recibe un numero entero y lo mete dentro de lado
	 * @param lado
	 */
	public Cubo(int lado) {
		this.lado = lado;
	}
	/**
	 * Al crear un cubo le pone al lado 1 por defecto
	 */
	public Cubo(){
		this.lado = 1;
	}
	/**
	 * Calcula la superficie del cubo y devuelve el total
	 * @return int
	 */
	public int superficie() {
		int total = this.lado*6;
		return total;
	}
	/**
	 * Calcula el volumen del cubo y devuelve el total
	 * @return int
	 */
	public int volumen() {
		int total = this.lado*this.lado;
		return total;
	}
}

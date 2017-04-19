/**
 * Artista.java
 * @asignatura Diseño y Analisis de Algoritmos
 * @practica Practica 4 - Algoritmos Constructivos
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 19 de abr. de 2017
 *
 */
package algoritmos;

public class Arista {
	
	private int i;
	private int j;
	private double valor;
	/**
	 * Constructor de la clase Arista
	 * @param i
	 * @param j
	 * @param valor
	 */
	public Arista(int i, int j, double valor) {
		setI(i);
		setJ(j);
		setValor(valor);
	}
	/**
	 * Getter de i
	 * @return the i
	 */
	public int getI() {
		return i;
	}
	/**
	 * Setter de i
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
	/**
	 * Getter de j
	 * @return the j
	 */
	public int getJ() {
		return j;
	}
	/**
	 * Setter de j
	 * @param j the j to set
	 */
	public void setJ(int j) {
		this.j = j;
	}
	/**
	 * Getter de valor
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * Setter de valor
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + i + ", " + j + ") = " + valor;
	}
	
	

}

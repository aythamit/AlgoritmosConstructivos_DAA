/**
 * AlgoritmosGreedy.java
 * @asignatura Diseño y Analisis de Algoritmos
 * @practica Practica 4 - Algoritmos Constructivos
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 19 de abr. de 2017
 *
 */
package algoritmos;

import java.util.ArrayList;

public class AlgoritmosGreedy {
	
	ArrayList<Arista> conjuntoAristas;

	public AlgoritmosGreedy(){
		setConjuntoAristas(new ArrayList<Arista>());
	}
	
	public void dispersion(){
		
	}
	/**
	 * Getter de conjuntoAristas
	 * @return the conjuntoAristas
	 */
	public ArrayList<Arista> getConjuntoAristas() {
		return conjuntoAristas;
	}

	/**
	 * Setter de conjuntoAristas
	 * @param conjuntoAristas the conjuntoAristas to set
	 */
	public void setConjuntoAristas(ArrayList<Arista> conjuntoAristas) {
		this.conjuntoAristas = conjuntoAristas;
	}
}

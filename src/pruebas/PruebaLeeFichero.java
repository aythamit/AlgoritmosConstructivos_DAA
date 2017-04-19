/**
 * PruebaLeeFichero.java
 * @asignatura Diseño y Analisis de Algoritmos
 * @practica Practica 4 - Algoritmos Constructivos
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 19 de abr. de 2017
 *
 */
package pruebas;

import java.io.IOException;
import java.util.ArrayList;

import algoritmos.Arista;
import fichero.LeeFichero;

public class PruebaLeeFichero {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayList<Arista> conjuntoAristas = new ArrayList<Arista>();
		LeeFichero p = new LeeFichero(args[0], conjuntoAristas);
		
		for(Arista it: conjuntoAristas){
			System.out.println(it);
		}

	}

}
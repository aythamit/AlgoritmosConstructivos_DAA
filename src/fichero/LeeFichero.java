/**
 * LeeFichero.java
 * @asignatura Diseño y Analisis de Algoritmos
 * @practica Practica 4 - Algoritmos Constructivos
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 19 de abr. de 2017
 *
 */
package fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import algoritmos.Arista;

public class LeeFichero {
	String fichero;
	 BufferedReader reader;
	public LeeFichero(String archivo, ArrayList<Arista> conjuntoAristas) throws NumberFormatException, IOException{
		setFichero(archivo);
		setReader(new BufferedReader(new FileReader( getFichero() )));
		
		cogeDatos(conjuntoAristas);
	}
	
	public void cogeDatos(ArrayList<Arista> conjuntoAristas) throws NumberFormatException, IOException{
		
		int n = Integer.parseInt(getReader().readLine());
		int i = 1;
		while(i <= n){

			 for(int j = i+1; j <= n; j++){
				 String sDato = getReader().readLine();
				 double dato = Double.parseDouble(sDato);
				 conjuntoAristas.add( new Arista(i,j,dato) );
				 //System.out.println("La arista ( " + i + " , " + j + " ) es : " + dato);
			 }
			 i++;
		}
	}

	/**
	 * Getter de fichero
	 * @return the fichero
	 */
	public String getFichero() {
		return fichero;
	}

	/**
	 * Setter de fichero
	 * @param fichero the fichero to set
	 */
	public void setFichero(String fichero) {
		this.fichero = fichero;
	}

	/**
	 * Getter de reader
	 * @return the reader
	 */
	public BufferedReader getReader() {
		return reader;
	}

	/**
	 * Setter de reader
	 * @param reader the reader to set
	 */
	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}
}
	
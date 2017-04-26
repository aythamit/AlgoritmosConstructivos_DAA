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
	ArrayList<Arista> solucion;

	public AlgoritmosGreedy(){
		setConjuntoAristas(new ArrayList<Arista>());
		setSolucion(new ArrayList<Arista>());
	}
	
	public double maxMean(){
		Arista k = selecMejorArista(getConjuntoAristas()); //Selecionamos la Arista de mayos afinidad
		getSolucion().add(k); //La añadimos al conjunto de soluciones
		
		ArrayList<Arista> solucionPrima = new ArrayList<Arista>();
		
		while(!getSolucion().equals(solucionPrima)){
			solucionPrima = getSolucion(); //Igualamos la solucion actual a S*
			k = obtenK(solucionPrima); // Obtenemos el maximo vertice
			solucionPrima.add(k); //La añadimos al conjunto de S*
			getConjuntoAristas().remove(k); //La quitamos del grafo
			if(getValue(solucionPrima) >= getValue(getSolucion())){
				setSolucion(solucionPrima); //Si maximiza el valor lo añadimos a S
			}
		}
		System.out.print("\n Solucion : ");
		for(Arista it: getSolucion()){
			System.out.print("[ " + it + " ] , ");
		}
		return getValue(getSolucion());
	}
	
	
	
	/**
	 * Metodo que calcula el valor actual de una Solucion teniendo en cuenta el numero de Nodos
	 * @param solucion
	 * @return
	 */
	private double getValue(ArrayList<Arista> solucion){
		double acumulador = 0;
		for(Arista it : solucion){
			acumulador += it.getValor();
		}
		return (acumulador / cuentaNodos(solucion));
	}
	
	
	/**
	 * Metodo que obtiene la mejor arista para la solucion actual.
	 * @param solucionPrima
	 * @return
	 */
	private Arista obtenK(ArrayList<Arista> solucionPrima) {
			Arista temp = getConjuntoAristas().get(0);
			for(Arista it : getConjuntoAristas()){
				
			}
		return temp;
	}
	
	
	/**
	 * Metodo que selecciona la arista con mayor Afinidad.
	 * @param S
	 * @return
	 */
	public Arista selecMejorArista(ArrayList<Arista> S){
		Arista temp = S.get(0);
		for(Arista it : getConjuntoAristas()){
			if(it.getValor() > temp.getValor()){
				temp = it;
			}
		}
		return temp;
	}
	
	
	/**
	 * Metodo que devuelve cuantos Nodos diferentes exiten en el Array
	 * @param S
	 * @return
	 */
	public int cuentaNodos(ArrayList<Arista> S){
		ArrayList<Integer> nodos = new ArrayList<Integer>();
		for(Arista it : S){
			if( !nodos.contains(it.getI()))
				nodos.add(it.getI());
			if( !nodos.contains(it.getJ()))
				nodos.add(it.getJ());
		}
		return nodos.size();
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

	/**
	 * Getter de solucion
	 * @return the solucion
	 */
	public ArrayList<Arista> getSolucion() {
		return solucion;
	}

	/**
	 * Setter de solucion
	 * @param solucion the solucion to set
	 */
	public void setSolucion(ArrayList<Arista> solucion) {
		this.solucion = solucion;
	}
}

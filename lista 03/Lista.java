package lista3;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		System.out.println( lista.add(10) );
		
		System.out.println( lista.add(20) );
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(3);
		lista2.add(3);
		lista2.add(3);
		
		System.out.println( lista.addAll(lista2) );
		
		for( Integer x: lista )
			System.out.println( x );
		
		System.out.println( "posição no vetor: " + lista.indexOf(3) );
		System.out.println( "posição no vetor: " + lista.lastIndexOf(3) );
		
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(10);
		lista3.add(20);
		
		lista.retainAll(lista3);
		
		for( Integer x: lista )
			System.out.println( x );
		
	}

}
  //Exercício 1
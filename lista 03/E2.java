package lista3;

import java.util.HashSet;
import java.util.Iterator;

public class E2 {

	public static void main(String[] args) {
		
		HashSet<Integer> lista = new HashSet<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		for( Integer x: lista )
			System.out.println( x );	
		
		System.out.println("-------------------------------------");
		
		System.out.println( lista.contains(5) );
		System.out.println( lista.contains(1) );
		
		System.out.println("-------------------------------------");
		
		HashSet<Integer> lista2 = new HashSet<Integer>();
		lista2.add(1);
		lista2.add(2);
		
		HashSet<Integer> lista3 = new HashSet<Integer>();
		lista3.add(5);
		lista3.add(2);
		
		System.out.println( lista.containsAll( lista2 ) );
		System.out.println( lista.containsAll( lista3 ) );
		
		System.out.println("-------------------------------------");
		
		Iterator<Integer> it = lista.iterator();
		
		while( it.hasNext() ) {
			  System.out.println( it.next() );
		}
		
		System.out.println("-------------------------------------");
		
		lista.removeAll(lista2);
		
		for( Integer x: lista2 )
			System.out.println( x );		
		
	}

}
  //Exercício 2
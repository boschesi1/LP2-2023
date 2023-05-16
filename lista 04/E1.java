package lista4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Random random = new Random();
		
		do {
			lista.add( random.nextInt(1, 10));
		}
		while( lista.size() < 5 );
        or( Integer i: lista )
			System.out.println( i );
		
		System.out.println("-------------------------" );
        Collections.sort( lista, Collections.reverseOrder() );
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println("-------------------------" );
        Collections.sort( lista );
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println("-------------------------" );
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(500);
		lista2.add(500);
        Collections.copy( lista, lista2 );
		
		for( Integer i: lista )
			System.out.println( i );
	}

}
//Exercício 1
package lista3;

import java.util.Objects;

public class Exercicio3 {

	public static void main(String[] args) {
        String aluno1 = "Domingos Bernardo";
		String aluno2 = "Gabriel Medina";
		String aluno3 = "Italo Ferreira";
		String aluno4 = "Domingos Bernardo";
		
		System.out.println( Objects.equals( aluno1, aluno2 ) );
		System.out.println( Objects.equals( aluno1, aluno4 ) );	
		
		System.out.println( Objects.hash( aluno1 ) );		
		System.out.println( Objects.hash( aluno2, aluno3 ) );
		
	}

}
  //Exercício 3
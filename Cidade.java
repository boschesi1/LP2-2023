import java.util.*;

public class Cidade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mapaCidades = new HashMap<>();
        
        System.out.println("Digite o nome de uma cidade (ou 'fim' para encerrar):");
        String nomeCidade = sc.nextLine();
        
        while (!nomeCidade.equals("fim")) {
            mapaCidades.put(nomeCidade, nomeCidade.length());
            
            System.out.println("Digite o nome de outra cidade (ou 'fim' para encerrar):");
            nomeCidade = sc.nextLine();
        }
        
        System.out.println("Cidades cadastradas:");
        for (String cidade : mapaCidades.keySet()) {
            System.out.println("- " + cidade + " (" + mapaCidades.get(cidade) + " letras)");
        }
    }
}
  //Exercício 1
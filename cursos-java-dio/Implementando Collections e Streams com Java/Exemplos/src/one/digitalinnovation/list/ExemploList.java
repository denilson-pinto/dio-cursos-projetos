/*
1 - Crie uma lista e execute as seguintes operações:

- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
- Navegue na lista exibindo cada nome no console.
- Substitua o nome Carlos por Roberto.
- Retorne o nome da posição 1.
- Remova o nome da posição 4.
- Remova o nome João.
- Retorne a quantidade de itens na lista.
- Verifique se o nome Juliano existe na lista.
- Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os items da nova lista na primeira lista criada.
- Ordene os itens da lista por ordem alfabética.
- Verifique se a lista está vazia.
*/

package one.digitalinnovation.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>(); 
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		System.out.println(nomes);
		
		nomes.set(2, "Roberto");
		
		System.out.println(nomes);
		
		String nome = nomes.get(1);
		
		System.out.println(nome);
		
		nomes.remove("João");
		
		System.out.println(nomes);
		
		int tamanho = nomes.size();
		
		System.out.println(tamanho);
		
		boolean temJuliano = nomes.contains("Juliano");
		
		System.out.println(temJuliano);
		
		List<String> nomes2 = new ArrayList<>();
		
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");
		
		nomes.addAll(nomes2);
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		boolean listaVazia = nomes.isEmpty();
		
		System.out.println(listaVazia);

	}

}

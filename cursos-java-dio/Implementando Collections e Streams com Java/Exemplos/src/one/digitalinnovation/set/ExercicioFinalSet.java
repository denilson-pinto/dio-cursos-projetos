/*
Exercício final:

1 - Crie um set e execute as seguintes operações:

- Adicione 5 números inteiros: 3, 88, 20, 44, 3.
- Navegue no Set exibindo cada número no console.
- Remova o primeiro item do Set.
- Adicione um novo número no Set: 23.
- Verifique o tamanho do Set.
- Verifique se o Set está vazio.
*/

package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioFinalSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		System.out.println("Exibição dos números através do System.out.println:");
		System.out.println(numeros);
		System.out.println("========================================================");
		
		System.out.println("Exibição dos números utilizando o Iterator e While:");
		Iterator<Integer> iterator = numeros.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("========================================================");
		System.out.println("Exibição dos números utilizando o forEach:");
		for(Integer num: numeros) {
			System.out.println(num);
		}
		
		System.out.println("=========================================================");
		numeros.remove(3);
		System.out.println("Removendo o primeiro item do set [3]: " + numeros);
		numeros.add(23);
		System.out.println("Adicionando um novo número no set [23]: " + numeros);
		
		System.out.println("=========================================================");
		System.out.println("Tamanho do set: " + numeros.size());
		System.out.println("Set está vazio ? " + numeros.isEmpty());

	}

}

/*
2 - Crie uma fila e execute as seguintes operações:

	- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
	- Navegue na lista exibindo cada nome no console.
	- Retorne o primeiro item da fila, sem removê-lo.
	- Retorne o primeiro item da fila, removendo o mesmo.
	- Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
	- Retorne o tamanho da fila.
	- Verifique se a fila está vazia.
	- Verifique se o nome Carlos está na fila.
*/

package one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Juliana");
		filaBanco.add("Pedro");
		filaBanco.add("Carlos");
		filaBanco.add("Larissa");
		filaBanco.add("João");
		
		System.out.println(filaBanco);
		
		String consultaPrimeiroCliente = filaBanco.peek();
		
		System.out.println(consultaPrimeiroCliente);
		
		String clienteASerAtendido = filaBanco.poll();
		
		System.out.println(clienteASerAtendido);
		
		System.out.println(filaBanco);
		
		filaBanco.add("Daniel");
		
		System.out.println(filaBanco);
		
		System.out.println(filaBanco.size());
		
		System.out.println(filaBanco.isEmpty());
		
		boolean temCarlos = filaBanco.contains("Carlos");
		
		System.out.println(temCarlos);

	}

}

/*
Exercício final

1 -  Utilizando uma lista com um objeto complexo (Estudante, por exemplo) realize as seguintes operações:

A) Transforme cada estudante em uma string com os atributos do objeto

B) Conte a quantidade de estudantes tem na coleção

C) Filtre estudantes com idade igual ou superior a 18 anos 

D) Exiba cada elemento no console

E) Retorne estudantes com nome que possui a letra B

F) Retorne se existe ao menos um estudante com a letra D no nome

G) Retorne o estudante mais velho (maior idade) da coleção. Retorne o mais novo também
*/

package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStream {

	public static void main(String[] args) {
		
		List<Estudante> estudantes = new ArrayList<>();
		estudantes.add(new Estudante("LaMelo", 23));
		estudantes.add(new Estudante("Alexandra", 32));
		estudantes.add(new Estudante("Bruno", 41));
		estudantes.add(new Estudante("Luka", 26));
		estudantes.add(new Estudante("Elina", 28));
		estudantes.add(new Estudante("Sheila", 37));
		estudantes.add(new Estudante("Emma", 18));
		estudantes.add(new Estudante("Aaron", 36));
		estudantes.add(new Estudante("Leylah", 19));
		estudantes.add(new Estudante("Andreas", 20));
		
		//estudantes.stream().forEach(System.out::println);
		
		//System.out.println("Contagem de estudantes: " + estudantes.stream().count());
		
//		System.out.println("Estudantes com 18 anos ou mais: " + estudantes.stream().filter(estudante -> estudante.getIdade() >= 18)
//				.sorted(Comparator.comparing(Estudante::getNome)).map(Estudante::getNome).collect(Collectors.toList()));
		
//		System.out.println("Estudantes com a letra B no nome:\n " + estudantes.stream().filter((estudante) -> 
//		estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));
		
//		System.out.println("Tem algum estudante com a letra D no nome? " + estudantes.stream().
//				anyMatch((estudante) -> estudante.getNome().contains("d")));
		
		System.out.println("Estudante mais velho: " + estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)));
		
		System.out.println("Estudante mais novo: " + estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)));


	}

}

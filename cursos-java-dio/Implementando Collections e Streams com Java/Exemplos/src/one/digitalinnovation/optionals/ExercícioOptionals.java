/*
Exercício final

1 - Crie um optional de um determinado tipo de dado:

    - Crie com estado vazio, estado presente e com null
    - Se presente, exiba o valor no console
    - Se vazio, lance uma exceção IllegalStateException
    - Se vazio, exiba "Optinal vazio" no console
    - Se presente, transforme o valor e exiba no console
    - Se presente, pegue o valor do optional e atribua em uma variável
    - Se presente, filtre o optional com uma determinada regra de negócio
*/

package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExercícioOptionals {
	
	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.of("Valor está presente");
		Optional<String> optionalEmpty = Optional.empty();
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println(optionalString.orElse("Vazio"));
		System.out.println(optionalEmpty.orElse("empty = Optional vazio"));
		//System.out.println(optionalNull.orElse("null = valor não está presente"));
		System.out.println(optionalString.orElseThrow(IllegalStateException::new));
		
		if(optionalNull.isPresent()) {
			String valor = optionalNull.get();
			System.out.println(valor);
		}
		
		optionalNull.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
	}

}

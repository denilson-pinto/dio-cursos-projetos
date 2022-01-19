package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

	public static void main(String[] args) {

		Optional<String> optionalString = Optional.of("Valor presente");
		Optional<String> emptyOptional = Optional.empty();
		Optional<String> optionalNull = Optional.ofNullable(null);
		//Optional<String> optionalNullErro = Optional.of(null);
		
//		// Imprimindo
//		System.out.println(optionalString);
//		System.out.println(emptyOptional);
//		System.out.println(optionalNull);
//		
		// Buscando valores
		System.out.println(optionalString.orElse("Vazio"));
		System.out.println(emptyOptional.orElse("empty = valor não está presente"));
		System.out.println(optionalNull.orElse("null = valor não está presente"));
		//System.out.println(optionalNullErro.orElse("Valor opcional que lança erro NullPointerException"));
		
		
	}

}

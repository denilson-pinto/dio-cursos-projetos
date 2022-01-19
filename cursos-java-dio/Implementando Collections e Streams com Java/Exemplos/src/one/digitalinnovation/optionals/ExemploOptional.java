package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {

		Optional<String> optionalString = Optional.of("Valor opcional");
		Optional<String> optionalEmpty = Optional.empty();
				
		System.out.println(optionalString.isPresent());
		System.out.println(optionalEmpty);
		
		//System.out.println(optionalString.ifPresent());
		
		System.out.println(optionalString.orElse("Valor não está presente"));
		
		if(optionalString.isPresent()) {
			String valor = optionalString.get();
			System.out.println(valor);
		}
		
		optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
		
		optionalString.orElseThrow(IllegalStateException::new);
	}

}

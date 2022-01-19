package one.digitalinnovation.exerciciocomparators;

//import java.util.Collection;
//import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CampeasTenisTreeMap {

	public static void main(String[] args) {

		/*
		 * Campeao court = new Campeao("MARGARET COURT", 24, "Individual", "Austrália",Albury"); 
		 * Campeao williams = new Campeao("SERENA WILLIAMS", 23,"Individual", "EUA", "Saginaw"); 
		 * Campeao graf = new Campeao("STEFFI GRAF", 22, "Individual", "Alemanha", "Mannheim"); 
		 * Campeao wills = new Campeao("HELEN WILLS", 19, "Individual", "EUA", "Centerville"); 
		 * Campeao evert = new Campeao("CHRIS EVERT", 18, "Individual", "EUA", "Fort Lauderdale");
		 * Campeao navratilova = new Campeao("MARTINA NAVRATILOVA", 18, "Individual", "EUA (NATURALIZADA)", "Praga (Rep. Tcheca)"); 
		 * Campeao king = new Campeao("BILLIE JEAN KING", 12, "Individual", "EUA", "Long Beach"); 
		 * Campeao connolly = new Campeao("MAUREEN CONNOLLY", 9, "Individual", "EUA", "San Diego"); 
		 * Campeao seles = new Campeao("MONICA SELES", 9, "Individual", "EUA", "Sarasota"); 
		 * Campeao lenglen = new Campeao("SUZANNE LENGLEN", 8, "Individual", "França", "Compienha"); 
		 * Campeao mallory = new Campeao("MOLLA MALLORY", 8, "Individual", "Noruega", "Mosvik");
		 */

		TreeMap<Integer, String> treeCampeasTenis = new TreeMap<>();
		treeCampeasTenis.put(24, "Nome: MARGARET COURT        País: AUSTRÁLIA                      Cidade: ALBURY");
		treeCampeasTenis.put(23, "Nome: SERENA WILLIAMS       País: ESTADOS UNIDOS                 Cidade: SAGINAW");
		treeCampeasTenis.put(22, "Nome: STEFFI GRAF           País: ALEMANHA                       Cidade: MANNHEIM");
		treeCampeasTenis.put(19, "Nome: HELEN WILLS           País: ESTADOS UNIDOS                 Cidade: CENTERVILLE");
		treeCampeasTenis.put(18, "Nome: CHRIS EVERT           País: ESTADOS UNIDOS                 Cidade: FORT LAUDERDALE");
		treeCampeasTenis.put(18, "Nome: MARTINA NAVRATILOVA   País: ESTADOS UNIDOS (NATURALIZADA)  Cidade: PRAGA (REP. TCHECA)");
		treeCampeasTenis.put(12, "Nome: BILLIE JEAN KING      País: ESTADOS UNIDOS                 Cidade: LONG BEACH");
		treeCampeasTenis.put(9, " Nome: MAUREEN CONNOLLY      País: ESTADOS UNIDOS                 Cidade: SAN DIEGO");
		treeCampeasTenis.put(9, " Nome: MONICA SELES          País: ESTADOS UNIDOS                 Cidade: SARASOTA");
		treeCampeasTenis.put(8, " Nome: SUZANNE LENGLEN       País: FRANÇA                         Cidade: COMPIENHA");
		treeCampeasTenis.put(8, " Nome: MOLLA MALLORY         País: NORUEGA                        Cidade: MOSVIK");

		// System.out.println("--- ordem natural dos números (ascendente) - títulos---");
		// System.out.println(treeCampeasTenis + "\n");

		// Navega em todas as chaves do iterator
		//Iterator<Integer> iterator = treeCampeasTenis.keySet().iterator();

		//System.out.println("Navegando pela árvore usando Iterator e While:");
		//while (iterator.hasNext()) {
			//Integer key = iterator.next();
			//System.out.println("Nº de títulos: " + key + " - " + treeCampeasTenis.get(key));}

		System.out.println("Navegando pela árvore usando For, Map.Entry e entrySet:");
		for (Map.Entry<Integer, String> campeas : treeCampeasTenis.entrySet()) {
			System.out.println("Nº de títulos: " + campeas.getKey() + " - " + campeas.getValue() + "\n");
		}

		System.out.println("--- ordem reversa dos números - títulos --- ");
		for (Integer campeas : treeCampeasTenis.descendingKeySet()) {
			System.out.println("Nº de títulos: " + campeas);
		}
	}
}



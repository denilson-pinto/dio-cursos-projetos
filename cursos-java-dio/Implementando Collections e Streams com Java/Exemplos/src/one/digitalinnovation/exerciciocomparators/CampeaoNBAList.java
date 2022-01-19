package one.digitalinnovation.exerciciocomparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CampeaoNBAList {

	public static void main(String[] args) {
		
		List<Campeao> campeoesNBA = new ArrayList<>();
		
		campeoesNBA.add(new Campeao("LAKERS", 17,"Equipe", "EUA", "Los Angeles"));
		campeoesNBA.add(new Campeao("CELTICS", 17, "Equipe", "EUA", "Boston"));
		campeoesNBA.add(new Campeao("BULLS", 6, "Equipe", "EUA", "Chicago"));
		campeoesNBA.add(new Campeao("WARRIORS", 6, "Equipe", "EUA", "San Francisco"));
		campeoesNBA.add(new Campeao("SPURS", 5, "Equipe", "EUA", "San Antonio"));
		campeoesNBA.add(new Campeao("76ers", 3, "Equipe", "EUA", "Philadelphia"));
		campeoesNBA.add(new Campeao("PISTONS", 3, "Equipe", "EUA", "Detroit"));
		campeoesNBA.add(new Campeao("HEAT", 3, "Equipe", "EUA", "Miami"));
		campeoesNBA.add(new Campeao("KNICKS", 2, "Equipe", "EUA", "New York"));
		campeoesNBA.add(new Campeao("ROCKETS", 2, "Equipe", "EUA", "Houston"));
		campeoesNBA.add(new Campeao("BUCKS", 2, "Equipe", "EUA", "Milwaukee"));
		campeoesNBA.add(new Campeao("CAVALIERS", 1, "Equipe", "EUA", "Cleveland"));
		campeoesNBA.add(new Campeao("HAWKS", 1, "Equipe", "EUA", "Atlanta"));
		campeoesNBA.add(new Campeao("WIZARDS", 1, "Equipe", "EUA", "Washington"));
		campeoesNBA.add(new Campeao("TRAIL BLAZERS", 1, "Equipe", "EUA", "Portland"));
		campeoesNBA.add(new Campeao("MAVERICKS", 1, "Equipe", "EUA", "Dallas"));
		campeoesNBA.add(new Campeao("KINGS", 1, "Equipe", "EUA", "Sacramento"));
		campeoesNBA.add(new Campeao("RAPTORS", 1, "Equipe", "Canadá", "Toronto"));
		
		//System.out.println("--- ordem de inserção ---");
		//System.out.println(campeoesNBA);
		
		System.out.println("--- ordem natural dos números - títulos ---");
		campeoesNBA.sort((first, second) -> first.getTitulo() - second.getTitulo());
		System.out.println(campeoesNBA);
		
		//System.out.println("--- ordem reversa dos números - títulos ---");
		//campeoesNBA.sort((first, second) -> second.getTitulo() - first.getTitulo());
		//System.out.println(campeoesNBA);
		
		System.out.println("--- ordem natural dos números - títulos (method reference) ---");
		campeoesNBA.sort(Comparator.comparingInt(Campeao::getTitulo));		
		System.out.println(campeoesNBA);

		System.out.println("--- ordem reversa dos números - títulos (method reference) ---");
		campeoesNBA.sort(Comparator.comparingInt(Campeao::getTitulo).reversed());		
		System.out.println(campeoesNBA);
		
		System.out.println("--- ordem natural dos números - títulos (interface Comparable) ---");
		Collections.sort(campeoesNBA);
		System.out.println(campeoesNBA);
		
		System.out.println("--- ordem reversa dos números - títulos (interface Comparator) ---");
		Collections.sort(campeoesNBA, new CampeaoOrdemQtdeTituloReversa());
		System.out.println(campeoesNBA);

	}

}

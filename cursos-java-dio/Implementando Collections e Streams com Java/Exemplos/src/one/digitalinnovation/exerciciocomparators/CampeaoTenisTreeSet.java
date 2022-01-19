package one.digitalinnovation.exerciciocomparators;

import java.util.TreeSet;

public class CampeaoTenisTreeSet {

	public static void main(String[] args) {
		
		Campeao federer = new Campeao("ROGER FEDERER", 103, "Individual", "Suíça", "Basileia");
		Campeao nadal = new Campeao("RAFAEL NADAL", 85, "Individual", "Espanha", "Manacor");
		Campeao djokovic = new Campeao("NOVAK DJOKOVIC", 80, "Individual", "Sérvia", "Belgrado");
		Campeao sampras = new Campeao("PETE SAMPRAS", 64, "Individual", "EUA", "Washington (DC)");
		Campeao agassi = new Campeao("ANDRE AGASSI", 60, "Individual", "EUA", "Las Vegas");
		Campeao becker = new Campeao("BORIS BECKER", 49, "Individual", "Alemanha", "Leimen");
		Campeao murray = new Campeao("ANDY MURRAY", 46, "Individual", "Reino Unido", "Dunblane (ESCÓCIA)");
		Campeao muster = new Campeao("THOMAS MUSTER", 39, "Individual", "Áustria", "Leibnitz");
		Campeao roddick = new Campeao("ANDY RODDICK", 32, "Individual", "EUA", "Omaha");
		Campeao chang = new Campeao("MICHAEL CHANG", 31, "Individual", "EUA", "Hoboken");
		
		TreeSet<Campeao> treeCampeoesTenis = new TreeSet<>(); 
		treeCampeoesTenis.add(federer);
		treeCampeoesTenis.add(nadal);
		treeCampeoesTenis.add(djokovic);
		treeCampeoesTenis.add(sampras);
		treeCampeoesTenis.add(agassi);
		treeCampeoesTenis.add(becker);
		treeCampeoesTenis.add(murray);
		treeCampeoesTenis.add(muster);
		treeCampeoesTenis.add(roddick);
		treeCampeoesTenis.add(chang);
		
		//System.out.println("--- ordem de inserção ---");
		//System.out.println(treeCampeoesTenis + "\n");
		
		System.out.println("--- ordem natural dos números - títulos ---");
		for(Campeao campeoes : treeCampeoesTenis) {
			System.out.println(campeoes);
		}
		
		System.out.println("--- ordem reversa dos números - títulos ---");
		for(Campeao campeoes : treeCampeoesTenis.descendingSet()) {
			System.out.println(campeoes);
		}
		
	}

}


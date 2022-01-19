package one.digitalinnovation.exerciciocomparators;

import java.util.Comparator;

public class CampeaoOrdemQtdeTituloReversa implements Comparator<Campeao>{
	
	@Override
	public int compare(Campeao o1, Campeao o2) {
		return o2.getTitulo() - o1.getTitulo();
	}

}

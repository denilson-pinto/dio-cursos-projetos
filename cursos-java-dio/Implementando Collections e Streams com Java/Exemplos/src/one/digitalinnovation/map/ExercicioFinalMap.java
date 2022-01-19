/*
Exercício Final

1 - Crie uma Map e execute as seguintes operações:

    - Adicione os 26 estados brasileiros no Map, onde a sigla será a chave e o nome do estado o valor.
    - Remova o estado de Minas Gerais.
    - Adicione o Distrito Federal.
    - Verifique o tamanho do mapa.
    - Remova o estado de Mato Grosso do Sul usando o nome.
    - Navegue em todos os registros do map mostrando no console no seguinte formato: NOME (SIGLA).
    - Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC).
    - Verifique se o estado de Maranhão existe no map buscando por seu nome.
*/

package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExercicioFinalMap {

	public static void main(String[] args) {
		
		Hashtable<String, String> estadosBrasil = new Hashtable<>();
		
		estadosBrasil.put("AC", "ACRE");
		estadosBrasil.put("AL", "ALAGOAS");
		estadosBrasil.put("AP", "AMAPÁ");
		estadosBrasil.put("AM", "AMAZONAS");
		estadosBrasil.put("BA", "BAHIA");
		estadosBrasil.put("CE", "CEARÁ");
		estadosBrasil.put("ES", "ESPÍRITO SANTO");
		estadosBrasil.put("GO", "GOIÁS");
		estadosBrasil.put("MA", "MARANHÃO");
		estadosBrasil.put("MT", "MATO GROSSO");
		estadosBrasil.put("MS", "MATO GROSSO DO SUL");
		estadosBrasil.put("MG", "MINAS GERAIS");
		estadosBrasil.put("PA", "PARÁ");
		estadosBrasil.put("PB", "PARAÍBA");
		estadosBrasil.put("PR", "PARANÁ");
		estadosBrasil.put("PE", "PERNAMBUCO");
		estadosBrasil.put("PI", "PIAUÍ");
		estadosBrasil.put("RR", "RORAIMA");
		estadosBrasil.put("RO", "RONDÔNIA");
		estadosBrasil.put("RJ", "RIO DE JANEIRO");
		estadosBrasil.put("RN", "RIO GRANDE DO NORTE");
		estadosBrasil.put("RS", "RIO GRANDE DO SUL");
		estadosBrasil.put("SC", "SANTA CATARINA");
		estadosBrasil.put("SP", "SÃO PAULO");
		estadosBrasil.put("SE", "SERGIPE");
		estadosBrasil.put("TO", "TOCANTINS");
		
		estadosBrasil.remove("MG");
		
		estadosBrasil.put("DF", "DISTRITO FEDERAL");
		
		System.out.println("Tamanho do mapa: " + estadosBrasil.size());
		
		estadosBrasil.remove("MS", "MATO GROSSO DO SUL");
		
		for(Map.Entry<String, String> estado: estadosBrasil.entrySet()) {
			System.out.println(estado.getValue() + " (" + estado.getKey() + ")");
		}
		
		System.out.println("Mapa contém o estado de Santa Catarina? " + estadosBrasil.containsKey("SC"));
		
		System.out.println("Mapa contém o estado de Maranhão? " + estadosBrasil.containsValue("MARANHÃO"));
		
	}

}

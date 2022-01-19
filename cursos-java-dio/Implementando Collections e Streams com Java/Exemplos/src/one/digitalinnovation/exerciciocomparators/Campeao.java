package one.digitalinnovation.exerciciocomparators;

public class Campeao implements Comparable<Campeao>{
	
	private final String nome;
	private final Integer titulo;
	private final String tipo;
	private final String pais;
	private final String cidade;
	//private final Integer titulo;
	
	public Campeao(String nome, Integer titulo, String tipo, String pais, String cidade) {
		this.nome = nome;
		this.titulo = titulo;
		this.tipo= tipo;
		this.pais = pais;
		this.cidade = cidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getPais() {
		return pais;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public Integer getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(" Nome: ");
		stringBuffer.append(this.nome + " - ");
		stringBuffer.append("Númmero de títulos: ");
		stringBuffer.append(this.titulo + " - ");
		stringBuffer.append("Tipo: ");
		stringBuffer.append(this.tipo + " - ");
		stringBuffer.append("País: ");
		stringBuffer.append(this.pais + " - ");
		stringBuffer.append("Cidade: ");
		stringBuffer.append(this.cidade + "\n");
		
		return stringBuffer.toString() ;
		
	}
	
	@Override
	public int compareTo(Campeao o) {
		return this.getTitulo() - o.getTitulo();
	}

}

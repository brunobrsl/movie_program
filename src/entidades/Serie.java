package entidades;
public class Serie extends ProgramaEntretenimento {
	private Integer numTemporadas;
	private Integer qtdTemporadas;
	private Integer qtdEpisodioPorTemporada;
	
	public Serie(Double notaClassificacao, Integer qtdTemporadas, Integer qtdEpisodioPorTemporada) {
		super(notaClassificacao);
		this.qtdTemporadas = qtdTemporadas;
		this.qtdEpisodioPorTemporada = qtdEpisodioPorTemporada;
	}
	
	public Serie(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria,
			Double notaClassificacao, String duracao, String classificacao, Integer numTemporadas, Integer qtdTemporadas,
			Integer qtdEpisodioPorTemporada) {
		super(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao);
		this.numTemporadas = numTemporadas;
		this.qtdTemporadas = qtdTemporadas;
		this.qtdEpisodioPorTemporada = qtdEpisodioPorTemporada;
	}

	public Integer getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(Integer numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public Integer getQtdTemporadas() {
		return qtdTemporadas;
	}

	public void setQtdTemporadas(Integer qtdTemporadas) {
		this.qtdTemporadas = qtdTemporadas;
	}

	public Integer getQtdEpisodioPorTemporada() {
		return qtdEpisodioPorTemporada;
	}

	public void setQtdEpisodioPorTemporada(Integer qtdEpisodioPorTemporada) {
		this.qtdEpisodioPorTemporada = qtdEpisodioPorTemporada;
	}
	
	@Override
	public String classificarPrograma() {
		if(getNotaClassificacao() <= 4) {
			return "S�rie Ruim";
		} else if(getNotaClassificacao() > 4 && getNotaClassificacao() < 8) {
			return "S�rie Boa";
		} else {
			return "S�rie �tima";
		}
	}

	public int calculaTotalEpisodios() {
		return qtdTemporadas * qtdEpisodioPorTemporada;
	}
	
	@Override
	public String toString() {
		return "Nome: "
				+ getNome() + "\n"
				+ "Categoria: "
				+ getCategoria() + "\n"
				+ "Personagens Principais: "
				+ getPersonagensPrincipais() + "\n"
				+ "Faixa Et�ria: "
				+ getFaixaEtaria() + "\n"
				+ "Classifica��o: "
				+ getClassificacao() + "\n"
				+ "Nota da Classifica��o: "
				+ String.format("%.2f", getNotaClassificacao()) + "\n"
				+ "Dura��o: "
				+ getDuracao() + "\n"
				+ "Temporada em que est�: "
				+ getNumTemporadas() + "\n"
				+ "Quantidade de Temporadas: "
				+ getQtdTemporadas() + "\n"
				+ "Quantidade de Epis�dios por Temporada: "
				+ getQtdEpisodioPorTemporada() + "\n"
				+ "Total de Epis�dios: "
				+ calculaTotalEpisodios();
	}
				
}

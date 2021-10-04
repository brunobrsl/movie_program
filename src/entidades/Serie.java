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
			return "Série Ruim";
		} else if(getNotaClassificacao() > 4 && getNotaClassificacao() < 8) {
			return "Série Boa";
		} else {
			return "Série Ótima";
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
				+ "Faixa Etária: "
				+ getFaixaEtaria() + "\n"
				+ "Classificação: "
				+ getClassificacao() + "\n"
				+ "Nota da Classificação: "
				+ String.format("%.2f", getNotaClassificacao()) + "\n"
				+ "Duração: "
				+ getDuracao() + "\n"
				+ "Temporada em que está: "
				+ getNumTemporadas() + "\n"
				+ "Quantidade de Temporadas: "
				+ getQtdTemporadas() + "\n"
				+ "Quantidade de Episódios por Temporada: "
				+ getQtdEpisodioPorTemporada() + "\n"
				+ "Total de Episódios: "
				+ calculaTotalEpisodios();
	}
				
}

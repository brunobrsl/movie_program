package entidades;
public class Filme extends ProgramaEntretenimento {
	private String produtora;
	private String patrocinadores;
	
	public Filme() {
	}
	
	public Filme(Double notaClassificacao) {
		super(notaClassificacao);
	}
	
	public Filme(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria,
			Double notaClassificacao, String duracao, String classificacao, String produtora, String patrocinadores) {
		super(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao);
		this.produtora = produtora;
		this.patrocinadores = patrocinadores;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(String patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	
	@Override
	public String classificarPrograma() {
		if(getNotaClassificacao() <= 4.0) {
			return "Filme Ruim";
		} else if(getNotaClassificacao() > 4.0 && getNotaClassificacao() < 8.0) {
			return "Filme Bom";
		} else {
			return "Filme Ótimo";
		}
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
				+ "Produtora: "
				+ getProdutora() + "\n"
				+ "Patrocinadores: "
				+ getPatrocinadores();
	}
}


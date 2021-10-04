package entidades;	
public class ProgramaEntretenimento {
	private String nome;
	private String categoria;
	private String personagensPrincipais;
	private Integer faixaEtaria;
	private Double notaClassificacao;
	private String duracao;
	private String classificacao;
	
	public ProgramaEntretenimento() {
	}
	
	public ProgramaEntretenimento(Double notaClassificacao) {
		this.notaClassificacao = notaClassificacao;
	}

	public ProgramaEntretenimento(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria, Double notaClassificacao, String duracao, String classificacao) {
		this.nome = nome;
		this.categoria = categoria;
		this.personagensPrincipais = personagensPrincipais;
		this.faixaEtaria = faixaEtaria;
		this.notaClassificacao = notaClassificacao;
		this.duracao = duracao;
		this.classificacao = classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPersonagensPrincipais() {
		return personagensPrincipais;
	}

	public void setPersonagensPrincipais(String personagensPrincipais) {
		this.personagensPrincipais = personagensPrincipais;
	}

	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(Integer faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Double getNotaClassificacao() {
		return notaClassificacao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String classificarPrograma() {
		if(getNotaClassificacao() <= 4) {
			return classificacao = "Ruim";
		} else if(getNotaClassificacao() > 4 && getNotaClassificacao() < 8) {
			return classificacao = "Bom";
		} else {
			return classificacao = "Ótimo";
		}
	}

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
				+ getDuracao() + "\n";
	}
	
	
}

package entidades;
public class Documentario extends ProgramaEntretenimento {
	private String narrador;
	
	public Documentario(Double notaClassificacao) {
		super(notaClassificacao);
	}

	public Documentario(String nome, String categoria, String personagensPrincipais, Integer faixaEtaria, Double notaClassificacao, String duracao, String classificacao, String narrador) {
		super(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao);
		this.narrador = narrador;
	}

	public String getNarrador() {
		return narrador;
	}

	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}
	
	@Override
	public String classificarPrograma() {
		if(getNotaClassificacao() <= 4) {
			return "Documentário Ruim";
		} else if(getNotaClassificacao() > 4 && getNotaClassificacao() < 8) {
			return "Documentário Bom";
		} else {
			return "Documentário Ótimo";
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
				+ "Nome do Narrador: "
				+ getNarrador();
	}
}

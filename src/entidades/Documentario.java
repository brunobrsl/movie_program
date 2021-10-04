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
			return "Document�rio Ruim";
		} else if(getNotaClassificacao() > 4 && getNotaClassificacao() < 8) {
			return "Document�rio Bom";
		} else {
			return "Document�rio �timo";
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
				+ "Faixa Et�ria: "
				+ getFaixaEtaria() + "\n"
				+ "Classifica��o: "
				+ getClassificacao() + "\n"
				+ "Nota da Classifica��o: "
				+ String.format("%.2f", getNotaClassificacao()) + "\n"
				+ "Dura��o: "
				+ getDuracao() + "\n"
				+ "Nome do Narrador: "
				+ getNarrador();
	}
}

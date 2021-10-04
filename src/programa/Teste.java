package programa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Documentario;
import entidades.Filme;
import entidades.ProgramaEntretenimento;
import entidades.Serie;
public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//criação de uma lista para cada classe
		List<Filme> list1 = new ArrayList<>();
		List<Serie> list2 = new ArrayList<>();
		List<Documentario> list3 = new ArrayList<>();
		
		System.out.println("Informar quantidade (deve possuir pelo menos dois de cada): ");
		System.out.print("Quantidade de filmes: ");
		int n1 = sc.nextInt();
		System.out.print("Quantidade de séries: ");
		int n2 = sc.nextInt();
		System.out.print("Quantidade de documentários: ");
		int n3 = sc.nextInt();
		if(n1 < 2 || n2 < 2 || n3 < 2){ //finaliza o programa se a quantidade mínima não for alcançada
			System.out.println("Erro! Digite pelo menos dois items de cada categoria.");
			System.exit(0); 
		}

		//loop de cadastro de filmes
		System.out.println();
		System.out.println("----- INSERIR FILME -----");
		sc.nextLine();
		
		for(int i=1; i<=n1; i++) {
			System.out.println("DADOS DO #" + i + " FILME:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Categoria: ");
			String categoria = sc.nextLine();
			System.out.print("Personagens Principais: ");
			String personagensPrincipais = sc.nextLine();
			System.out.print("Faixa Etária: ");
			int faixaEtaria = sc.nextInt();
			System.out.print("Nota (0/10): ");
			double notaClassificacao = sc.nextDouble();
			System.out.print("Duração: ");
			sc.nextLine();
			String duracao = sc.nextLine();
			System.out.print("Produtora: ");
			String produtora = sc.nextLine();
			System.out.print("Patrocinadores: ");
			String patrocinadores = sc.nextLine();
			ProgramaEntretenimento filme1 = new Filme(notaClassificacao); //polimorfismo para adquirir a nota do filme
			String classificacao = filme1.classificarPrograma();
			ProgramaEntretenimento filme2 = new Filme(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao, produtora, patrocinadores); //polimorfismo 
			list1.add((Filme) filme2); //adicionar os dados na lista
			System.out.println();
		} 
		
		
		//loop de cadastro de séries
		System.out.println();
		System.out.println("----- INSERIR SÉRIE -----");
		
		for(int i=1; i<=n2; i++) {
			System.out.println("DADOS DA #" + i + " SÉRIE:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Categoria: ");
			String categoria = sc.nextLine();
			System.out.print("Personagens Principais: ");
			String personagensPrincipais = sc.nextLine();
			System.out.print("Faixa Etária: ");
			int faixaEtaria = sc.nextInt();
			System.out.print("Nota (0/10): ");
			double notaClassificacao = sc.nextDouble();
			System.out.print("Duração: ");
			sc.nextLine();
			String duracao = sc.nextLine();
			System.out.print("Está em que temporada? ");
			int numTemporadas = sc.nextInt();
			System.out.print("Quantidade de Temporadas: ");
			int qtdTemporadas = sc.nextInt();
			System.out.print("Quantidade de Episódios por Temporada: ");
			int qtdEpisodioPorTemporada = sc.nextInt();
			Serie serie1 = new Serie(notaClassificacao, qtdTemporadas, qtdEpisodioPorTemporada); //construtor instanciado para calcular o total de episodios e adquirir a nota da série
			String classificacao = serie1.classificarPrograma();
			serie1.calculaTotalEpisodios();
			ProgramaEntretenimento serie2 = new Serie(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao, numTemporadas, qtdTemporadas, qtdEpisodioPorTemporada); 
			list2.add((Serie) serie2);
			System.out.println();
			sc.nextLine();
		}
		
		//loop de cadastro de documentários
		System.out.println();
		System.out.println("----- INSERIR DOCUMENTÁRIO -----");
		
		for(int i=1; i<=n3; i++) {
			System.out.println("DADOS DO #" + i + " DOCUMENTÁRIO:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Categoria: ");
			String categoria = sc.nextLine();
			System.out.print("Personagens Principais: ");
			String personagensPrincipais = sc.nextLine();
			System.out.print("Faixa Etária: ");
			int faixaEtaria = sc.nextInt();
			System.out.print("Nota (0/10): ");
			double notaClassificacao = sc.nextDouble();
			System.out.print("Duração: ");
			sc.nextLine();
			String duracao = sc.nextLine();
			System.out.print("Nome do Narrador: ");
			String narrador = sc.nextLine();
			ProgramaEntretenimento doc1 = new Documentario(notaClassificacao);
			String classificacao = doc1.classificarPrograma();
			ProgramaEntretenimento doc2 = new Documentario(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao, narrador);
			list3.add((Documentario) doc2);
			System.out.println();
		}
		
		int opcao = 0;
		while (opcao != 4) {
			System.out.println("------ MENU ------");
			System.out.println();
			System.out.println("[1] Inserir um programa");
			System.out.println("[2] Buscar um programa");
			System.out.println("[3] Visualizar os programas");
			System.out.println("[4] Sair");
			System.out.print("Digite o número da operação que deseja fazer --> ");
			opcao = sc.nextInt();
			System.out.println();
			
			switch(opcao) {
			//menu secundário para o usuário escolher a lista onde os dados serão inseridos
			case 1: 
				int inserir = 0;
				System.out.println("DESEJA INSERIR QUAL TIPO DE PROGRAMA?");
				System.out.println("[1] Filme");
				System.out.println("[2] Série");
				System.out.println("[3] Documentário");
				System.out.println("[4] Cancelar");
				System.out.print("Opção --> ");
				inserir = sc.nextInt();
				System.out.println();
				
				if(inserir == 1) {
					System.out.println("--- DADOS DO FILME ---");
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Categoria: ");
					String categoria = sc.nextLine();
					System.out.print("Personagens Principais: ");
					String personagensPrincipais = sc.nextLine();
					System.out.print("Faixa Etária: ");
					int faixaEtaria = sc.nextInt();
					System.out.print("Nota (0/10): ");
					double notaClassificacao = sc.nextDouble();
					System.out.print("Duração: ");
					sc.nextLine();
					String duracao = sc.nextLine();
					System.out.print("Produtora: ");
					String produtora = sc.nextLine();
					System.out.print("Patrocinadores: ");
					String patrocinadores = sc.nextLine();
					ProgramaEntretenimento filme1 = new Filme(notaClassificacao);
					String classificacao = filme1.classificarPrograma();
					ProgramaEntretenimento filme2 = new Filme(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao, produtora, patrocinadores);
					list1.add((Filme) filme2);
					System.out.println("FILME INSERIDO COM SUCESSO!!");
					System.out.println();
				} else if(inserir == 2) {
					System.out.println("--- DADOS DA SÉRIE ---");
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Categoria: ");
					String categoria = sc.nextLine();
					System.out.print("Personagens Principais: ");
					String personagensPrincipais = sc.nextLine();
					System.out.print("Faixa Etária: ");
					int faixaEtaria = sc.nextInt();
					System.out.print("Nota (0/10): ");
					double notaClassificacao = sc.nextDouble();
					System.out.print("Duração: ");
					sc.nextLine();
					String duracao = sc.nextLine();
					System.out.print("Está em que temporada? ");
					int numTemporadas = sc.nextInt();
					System.out.print("Quantidade de Temporadas: ");
					int qtdTemporadas = sc.nextInt();
					System.out.print("Quantidade de Episódios por Temporada: ");
					int qtdEpisodioPorTemporada = sc.nextInt();
					Serie serie1 = new Serie(notaClassificacao, qtdTemporadas, qtdEpisodioPorTemporada);
					String classificacao = serie1.classificarPrograma();
					serie1.calculaTotalEpisodios();
					ProgramaEntretenimento serie2 = new Serie(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao, numTemporadas, qtdTemporadas, qtdEpisodioPorTemporada);
					list2.add((Serie) serie2);
					System.out.println("SÉRIE INSERIDA COM SUCESSO!!");
					System.out.println();
				} else if(inserir == 3) {
					System.out.println("--- DADOS DO DOCUMENTÁRIO ---");
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Categoria: ");
					String categoria = sc.nextLine();
					System.out.print("Personagens Principais: ");
					String personagensPrincipais = sc.nextLine();
					System.out.print("Faixa Etária: ");
					int faixaEtaria = sc.nextInt();
					System.out.print("Nota (0/10): ");
					double notaClassificacao = sc.nextDouble();
					System.out.print("Duração: ");
					sc.nextLine();
					String duracao = sc.nextLine();
					System.out.print("Nome do Narrador: ");
					String narrador = sc.nextLine();
					ProgramaEntretenimento doc1 = new Documentario(notaClassificacao);
					String classificacao = doc1.classificarPrograma();
					ProgramaEntretenimento doc2 = new Documentario(nome, categoria, personagensPrincipais, faixaEtaria, notaClassificacao, duracao, classificacao, narrador);
					list3.add((Documentario) doc2);
					System.out.println("DOCUMENTÁRIO INSERIDO COM SUCESSO!!");
					System.out.println();
				} else if(inserir == 4) {
					System.out.println("OPERAÇÂO CANCELADA.");
					System.out.println();
				} else {
					System.out.println("ERRO! DIGITE UM NÚMERO CORRESPONDENTE.");
					System.out.println();
				}
			break;
			//menu para a busca de programas
			case 2:
				int buscar = 0;
				System.out.println("DESEJA BUSCAR QUAL TIPO DE PROGRAMA?");
				System.out.println("[1] Filme");
				System.out.println("[2] Série");
				System.out.println("[3] Documentário");
				System.out.println("[4] Cancelar");
				System.out.print("Opção --> ");
				buscar = sc.nextInt();
				System.out.println();
				
				if(buscar == 1) {
					System.out.println("------ FILMES CADASTRADOS ------");
					for(Filme filme : list1) {
						System.out.println("FILME #" + (1+list1.indexOf(filme))); //mostra a posição dos filmes cadastrados na lista por ordem de inserção
						System.out.println(filme.toString());
						System.out.println();
					}
				} else if(buscar == 2) {
					System.out.println("------ SÉRIES CADASTRADAS ------");
					for(Serie serie : list2) {
						System.out.println("SÉRIE #" + (1+list2.indexOf(serie)));
						System.out.println(serie.toString());
						System.out.println();
					}
				} else if(buscar == 3) {
					System.out.println("------ DOCUMENTÁRIOS CADASTRADOS ------");
					for(Documentario doc : list3) {
						System.out.println("DOCUMENTÁRIO #" + (1+list3.indexOf(doc)));
						System.out.println(doc.toString());
						System.out.println();
					}
				} else if(buscar == 4) {
					System.out.println("OPERAÇÂO CANCELADA.");
					System.out.println();
				} else {
					System.out.println("ERRO! DIGITE UM NÚMERO CORRESPONDENTE.");
					System.out.println();
				}
				
			break;
			//listagem de todos os tipos de programas cadastrados pelo usuário
			case 3:
				System.out.println("| DADOS DOS PROGRAMAS REGISTRADOS |");
				System.out.println();

				System.out.println("------------ FILMES -----------");
				for(Filme filme : list1) {	
					System.out.println("FILME #" + (1+list1.indexOf(filme)));
					System.out.println(filme.toString());
					System.out.println();
				} 
				
				
				System.out.println("------------ SÉRIES -----------");	
				for(Serie serie : list2) {
					System.out.println("SÉRIE #" + (1+list2.indexOf(serie)));
					System.out.println(serie.toString());
					System.out.println();
				}
				
					
				System.out.println("-------- DOCUMENTÁRIOS --------");
				for(Documentario doc : list3) {
					System.out.println("DOCUMENTÁRIO #" + (1+list3.indexOf(doc)));
					System.out.println(doc.toString());
					System.out.println();
				}
			break;
			case 4:
				System.out.println("PROGRAMA FINALIZADO!");
				System.exit(0);
			break;
			default:
				System.out.println("ERRO! NÚMERO INFORMADO INVÁLIDO.");
			break;
			}
		}
	
	sc.close();
		
	}
}



import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Agenda {

	private Pessoa[] pessoas;
	int qtd;
	int aux = 0;

	public Agenda(int tamanho) {
		this.pessoas = new Pessoa[tamanho];
		this.qtd = 0;
	}

	public void add(Pessoa pessoa) {

		if (this.qtd == pessoas.length) {
			aumentandoVetor();
		}
		pessoas[qtd++] = pessoa;

		for (int i = 0; i < qtd; i++) {
			if (pessoa.getNome().compareTo(pessoas[i].getNome()) < 0) {
				deslocarRight(i);
				pessoas[i] = pessoa;
				return;
			}
		}
	}

	public int getIndice(String nome) {
		for (int i = 0; i < qtd; i++) {
			if (nome.equalsIgnoreCase(this.pessoas[i].getNome())) {
				return i;
			}
		}
		return 0;

	}

	public void remover(int indice) {

		for (int i = indice; i < this.qtd - 1; i++) {
			this.pessoas[i] = this.pessoas[i + 1];
		}

		this.qtd--;
	}

	public boolean remove(Pessoa pessoa) {
		for (int i = 0; i < qtd; i++) {
			if (pessoas[i].equals(pessoa)) {
				deslocarLeft(i);
				return true;
			}
		}
		return false;
	}

	private void aumentandoVetor() {
		if (this.qtd == this.pessoas.length) {
			Pessoa[] novasPessoas = new Pessoa[this.pessoas.length * 2];

			for (int i = 0; i < this.pessoas.length; i++) {
				novasPessoas[i] = this.pessoas[i];
			}
			this.pessoas = novasPessoas;
		}
	}

	private void deslocarRight(int i) {
		for (int j = qtd - 1; j >= i; j--) {
			pessoas[i + 1] = pessoas[i];
		}
	}

	private void deslocarLeft(int i) {
		for (int j = i; j < qtd - 1; j++) {
			pessoas[i] = pessoas[i + 1];
		}
	}

	public Pessoa buscar(String nome) {
		for (int i = 0; i < qtd; i++) {
			if (nome.equalsIgnoreCase(pessoas[i].getNome()))
				return pessoas[i];

		}
		return null;
	}

	public void buscarPeloNome(String nome) {
		
		System.out.println("------------------------------");
		System.out.println("Procurar contatos:");
		System.out.println("------------------------------");
		System.out.println("Nome: " + nome);

		for (int i = 0; i < qtd; i++) {
			if (pessoas[i].getNome().contains(nome)) {
				System.out.println("Nome: " + pessoas[i].getNome() + " - "
						+ "Telefone: " + pessoas[i].getTelefone());
			}else
				System.out.println("Contato não encontrado!");
			System.out.println("------------------------------");
		}
	}

	public boolean listar() {

		if (qtd == 0) {
			return false;
		} else {

			System.out.println("------------------------------");
			System.out.println("Contatos Cadastrados:");
			System.out.println("------------------------------");

			for (int k = 0; k < qtd; k++) {
				System.out.println(pessoas[k]);
			}
		}
		return true;
	}
	
	public static boolean validarTelefone(String tel) {  
		  
	    String formato = "\\d\\d\\d\\d-\\d\\d\\d\\d"; 
	      
	    if((tel == null) || (tel.length()!=9) || (!tel.matches(formato)))  
	        return false;  
	      
	    else  
	        return true;  
	} 

	@SuppressWarnings("resource")
	public void pressEnter() {
		System.out.println("Press enter to return");
		new Scanner(System.in).nextLine();
	}

}

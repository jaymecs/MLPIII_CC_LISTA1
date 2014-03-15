

public class Pessoa implements Comparable<Pessoa> {

	String nome;
	String telefone;
	
	public Pessoa(String nome, String telefone){
		
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " - " + "Telefone: "
		+ getTelefone() + "\n";
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.getNome().compareTo(outraPessoa.getNome());
	}
	
	
}

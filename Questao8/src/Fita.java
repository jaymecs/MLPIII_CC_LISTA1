
public class Fita {

	private String titulo;
	protected double precoLocacao;
	
	public Fita(String titulo, double preco){
		this.titulo = titulo;
		this.precoLocacao = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecoLocacao() {
		return precoLocacao;
	}

	public void setPrecoLocacao(double precoLocacao) {
		this.precoLocacao = precoLocacao;
	}
	
	
}

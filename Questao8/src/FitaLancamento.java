
public class FitaLancamento extends Fita {

	public FitaLancamento(String titulo, double preco) {
		super(titulo, preco);
		
	}

	public void precoLancamento(){
		this.precoLocacao += precoLocacao * 0.20;
	}

}

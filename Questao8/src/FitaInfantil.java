
public class FitaInfantil extends Fita {


	public FitaInfantil(String titulo, double preco) {
		super(titulo, preco);
		// TODO Auto-generated constructor stub
	}

	public void precoInfantil(){
		this.precoLocacao += precoLocacao * 0.40;
	}

}


public class VeiculoPasseio extends Veiculo {

	private int qtdPortas;
	boolean arCondicionado = false;
	public int getQtdPortas() {
		return qtdPortas;
	}
	
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	
}

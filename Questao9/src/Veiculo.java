public class Veiculo {

	private String palca;
	private String marca;
	private String modelo;
	private String ano;
	private double valorKmRodado;
	private double kmInicial;
	private double kmFinal;
	private double valorLocacao;

	public void getValor() {
		this.valorLocacao = (this.kmInicial - this.kmFinal) * valorKmRodado;
	}

	public String getPalca() {
		return palca;
	}

	public void setPalca(String palca) {
		this.palca = palca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

}

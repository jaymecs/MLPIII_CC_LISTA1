package lojadeinformatica;

public class Fatura {

	private String numero;
	private String descricao;
	private int qtdComprada;
	private double precoItem;
	private double valorFatura;

	public Fatura(String num, String descricao, int qtdComprada,
			double precoItem) {
		this.numero = num;
		this.descricao = descricao;
		this.qtdComprada = qtdComprada;
		this.precoItem = precoItem;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdComprada() {
		return qtdComprada;
	}

	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

	public double getValorFatura(int qtd, double precoItem) {

		if (precoItem < 0)
			precoItem = 0.0;

		valorFatura = qtd * precoItem;
		if (valorFatura < 0)
			valorFatura = 0;

		return valorFatura;
	}

}

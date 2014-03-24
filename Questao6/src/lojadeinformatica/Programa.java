package lojadeinformatica;

public class Programa {

	public static void main(String[] args) {

		Fatura fatura = new Fatura("001", "feijão", 1, 1.50);

		System.out.println(fatura.getValorFatura(fatura.getQtdComprada(),
				fatura.getPrecoItem()));

	}
}

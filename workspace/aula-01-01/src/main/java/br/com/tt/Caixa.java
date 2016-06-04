package br.com.tt;

import java.util.List;

public class Caixa {

	private Double maiorCompra = 0D;

	public void calcular(List<Compra> compras) {
		for (Compra compra : compras) {
			if (maiorCompra < compra.getValor()) {
				maiorCompra = compra.getValor();
			}
		}
	}

	public Double getMaiorCompra() {
		return maiorCompra;
	}
}

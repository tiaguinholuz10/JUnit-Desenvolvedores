package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		Caixa caixa = new Caixa();

		List<Compra> compras = new ArrayList<Compra>();
		compras.add(new Compra());
		compras.get(compras.size()-1).setProduto("Celular");
		compras.get(compras.size()-1).setValor(500D);

		caixa.calcular(compras);
		
		System.out.println("Resultado da Maior compra: "+caixa.getMaiorCompra());
	}
	
}

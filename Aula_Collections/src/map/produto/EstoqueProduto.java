package map.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

	private Map<Long, Produto> estoqueMap;

	public EstoqueProduto() {
		this.estoqueMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueMap.put(cod, new Produto(nome, quantidade, preco));
	}

	public void exibirProdutos() {
		System.out.println(estoqueMap);
	}

	public Double calcularValorTotalEstoque() {
		double valueTotal = 0;
		if (!estoqueMap.isEmpty()) {
			for (Produto p : estoqueMap.values()) {
				valueTotal += p.getQuantidade() * p.getPreco();
			}
		}
		return valueTotal;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double precoMaior = Double.MIN_VALUE;
		//if (!estoqueMap.isEmpty()) {
			for (Produto p : estoqueMap.values()) {
				if (p.getPreco() > precoMaior) {
					produtoMaisCaro = p;
					precoMaior = p.getPreco();
				}
			}
			return produtoMaisCaro;
		//}
		
	}

}

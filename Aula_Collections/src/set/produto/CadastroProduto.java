package set.produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

	protected void name() {
		
	} Set<Produto> cadastroSet;

	public CadastroProduto() {
		this.cadastroSet = new HashSet<>();
	}

	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		cadastroSet.add(new Produto(codigo, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtoPorNome = new TreeSet<>(cadastroSet);
		return produtoPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(cadastroSet);
		return produtoPorPreco;
	}

}

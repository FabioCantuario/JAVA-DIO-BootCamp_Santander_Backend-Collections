package map.produto;

public class AppEstoqueProduto {

	public static void main(String[] args) {

		EstoqueProduto estoque = new EstoqueProduto();

		// Exibe o estoque vazio
		estoque.exibirProdutos();

		// Adiciona produtos ao estoque
		estoque.adicionarProduto(123L, "caderno", 10, 10.0);
		estoque.adicionarProduto(145L, "borracha", 100, 3.5);
		estoque.adicionarProduto(155L, "lápis", 50, 5.0);
		estoque.adicionarProduto(489L, "ResmaPapel", 20, 20.0);

		// Exibe os produtos no estoque
		estoque.exibirProdutos();

		// Calcula e exibe o valor total do estoque
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

		// Obtém e exibe o produto mais caro
		Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
		System.out.println("Produto mais caro: " + produtoMaisCaro);
/*
		 * // Obtém e exibe o produto mais barato Produto produtoMaisBarato =
		 * estoque.obterProdutoMaisBarato(); System.out.println("Produto mais barato: "
		 * + produtoMaisBarato);
		 * 
		 * // Obtém e exibe o produto com a maior quantidade em valor no estoque Produto
		 * produtoMaiorQuantidadeValorTotal =
		 * estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
		 * System.out.println("Produto com maior quantidade em valor no estoque: " +
		 * produtoMaiorQuantidadeValorTotal);
*/
	}

}

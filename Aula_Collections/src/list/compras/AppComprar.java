package list.compras;

public class AppComprar {

	public static void main(String[] args) {
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		// Adicionando itens ao carrinho
		carrinho.adicionarItem("TV", 2500d, 3);
	    carrinho.adicionarItem("Lápis", 2d, 3);
	    carrinho.adicionarItem("Lápis", 2d, 3);
	    carrinho.adicionarItem("Caderno", 35d, 1);
	    carrinho.adicionarItem("Borracha", 2d, 2);
	    System.out.println("");
	    // Exibindo os itens no carrinho
	    carrinho.exibirItens();
	    System.out.println("");
	    // Removendo um item do carrinho
	    carrinho.removerItem("Lápis");
	    System.out.println("");
	    // Exibindo os itens atualizados no carrinho
	    carrinho.exibirItens();
	    System.out.println("");
	    // Calculando e exibindo o valor total da compra
	    System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());

	}

}

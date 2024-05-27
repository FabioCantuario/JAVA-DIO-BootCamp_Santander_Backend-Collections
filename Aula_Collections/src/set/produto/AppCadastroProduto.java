package set.produto;

public class AppCadastroProduto {

	public static void main(String[] args) {

		CadastroProduto cadastroProd = new CadastroProduto();

		// Adicionando produtos ao cadastro
		cadastroProd.adicionarProduto(1L, "Smartphone", 1000d, 10);
		cadastroProd.adicionarProduto(2L, "Notebook", 1500d, 5);
		cadastroProd.adicionarProduto(1L, "Mouse", 30d, 20);
		cadastroProd.adicionarProduto(4L, "Teclado", 50d, 15);

		// Exibindo todos os produtos no cadastro
		System.out.println("Exibindo todos os produtos no cadastro");
		System.out.println(cadastroProd.cadastroSet);

		// Exibindo produtos ordenados por nome
		System.out.println("Exibindo produtos ordenados por nome");
		System.out.println(cadastroProd.exibirProdutosPorNome());

		// Exibindo produtos ordenados por preço
		System.out.println("Exibindo produtos ordenados por preço");
		System.out.println(cadastroProd.exibirProdutosPorPreco());

	}

}

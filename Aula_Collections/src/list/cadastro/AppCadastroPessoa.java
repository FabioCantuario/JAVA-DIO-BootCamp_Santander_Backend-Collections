package list.cadastro;

public class AppCadastroPessoa {

	public static void main(String[] args) {

		OrdenacaoPessoa ordemPessoa = new OrdenacaoPessoa();

		ordemPessoa.adicionarPessoa("Fabio", 43, 1.68);
		ordemPessoa.adicionarPessoa("Alcione", 77, 1.50);
		ordemPessoa.adicionarPessoa("Claudeci", 45, 1.48);
		ordemPessoa.adicionarPessoa("Karen", 20, 1.65);
		ordemPessoa.adicionarPessoa("Caua", 17, 1.69);
		ordemPessoa.adicionarPessoa("Ana", 48, 1.49);

		System.out.println(ordemPessoa.ordenarPorIdade());
		// System.out.println(ordemPessoa.ordenarPorAltura());

	}

}

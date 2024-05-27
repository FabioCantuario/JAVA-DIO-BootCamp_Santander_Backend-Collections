package list.biblioteca;

public class AppBiblioteca {

	public static void main(String[] args) {
		
		CatalogoLivro relLivro = new CatalogoLivro();
		
		relLivro.adicionarLivro("Livro 1", "Alcione", 1880);
		relLivro.adicionarLivro("Livro 2", "Alcione", 2000);
		relLivro.adicionarLivro("Livro 1", "Fabio", 1970);
		relLivro.adicionarLivro("Livro 3", "Karen", 2024);
		relLivro.adicionarLivro("Livro 4", "Karen", 1888);
		
		//System.out.println(relLivro.pesquisarPorAutor("Fabio"));
		//System.out.println(relLivro.pesquisarPorAutor("Alcione"));
		//System.out.println(relLivro.pesquisarPorIntervaloAnos(1880, 1970));
		System.out.println(relLivro.pesquisarPorTitulo("Livro 1"));

	}

}

package biblioteca;

public class AppBiblioteca {

	public static void main(String[] args) {
		
		CatalogoLivro relLivro = new CatalogoLivro();
		
		relLivro.adicionarLivro("Pequeno Principe", "F G Cantuario", 1980);
		
		System.out.println("O livro cadastro é: " + relLivro);

	}

}

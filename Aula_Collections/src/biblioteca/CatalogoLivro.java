package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

	private List<Livro> listaLivro;

	public CatalogoLivro() {
		this.listaLivro = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listaLivro.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> listaPorAutor = new ArrayList<>();
		if (!listaLivro.isEmpty()) {
			for (Livro listaAutor : listaLivro) {
				if (listaAutor.getAutor().equalsIgnoreCase(autor)) {
					listaPorAutor.add(listaAutor);
				}
			}
		}
		return listaPorAutor;
	}
/*
	public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		for (Livro listaAno : listaLivro) {
			if (anoInicial >= listaAno.getAnoPublicacao() && anoFinal <= listaAno.getAnoPublicacao()) {
				System.out.println("Livro encontrado pelo Ano de Publicação");
			} else {
				System.out.println("Livro não encontrado pelo ano de Publicação");
			}
		}

	}

	public void pesquisarPorTitulo(String titulo) {
		for (Livro listaTitulo : listaLivro) {
			if (titulo == listaTitulo.getTitulo()) {
				System.out.println("Livro encontrado pelo Titulo.");
			} else {
				System.out.println("Livro não localizado pelo Titulo.");
			}
		}

	}
*/
}

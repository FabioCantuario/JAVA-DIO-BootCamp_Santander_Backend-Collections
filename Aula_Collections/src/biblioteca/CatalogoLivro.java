package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

	List<Livro> listaLivro;

	public CatalogoLivro() {
		this.listaLivro = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listaLivro.add(new Livro(titulo, autor, anoPublicacao));
	}

	public void pesquisarPorAutor(String autor) {
		for (Livro listaAutor : listaLivro) {
			if (autor == listaAutor.getAutor()) {
				System.out.println("Autor de Livro encontrado");
			} else {
				System.out.println("Autor de Livro não localizado");
			}
		}

	}

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

	public String toString() {
		return  listaLivro;
	}
	
	

}

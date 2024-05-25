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

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> listaPorIntervaloAno = new ArrayList<>();
		if (!listaLivro.isEmpty()) {
			for (Livro listaAno : listaLivro) {
				if (listaAno.getAnoPublicacao() >= anoInicial && listaAno.getAnoPublicacao() <= anoFinal) {
					listaPorIntervaloAno.add(listaAno);
				}
			}
		}

		return listaPorIntervaloAno;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro listaPorTitulo = null;
		if (!listaLivro.isEmpty()) {
			for (Livro listaTitulo : listaLivro) {
				if (listaTitulo.getTitulo().equalsIgnoreCase(titulo)) {
					listaPorTitulo = listaTitulo;
					break;
				}
			}
		}
		return listaPorTitulo;
	}
}

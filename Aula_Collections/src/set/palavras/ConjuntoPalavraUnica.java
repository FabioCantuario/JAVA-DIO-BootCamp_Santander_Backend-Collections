package set.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavraUnica {

	private Set<String> palavrasUnica;

	public ConjuntoPalavraUnica() {
		this.palavrasUnica = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavrasUnica.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (!palavrasUnica.isEmpty()) {
			if (palavrasUnica.contains(palavra)) {
				palavrasUnica.remove(palavra);
			} else {
				System.out.println("Palavra não encontrada no conjunto");
			}
		} else {
			System.out.println("Conjunto vazio!!");
		}
	}

	public boolean verificarPalavra(String palavra) {
		return palavrasUnica.contains(palavra);
	}

	public void exibirPalavrasUnicas() {
		if (!palavrasUnica.isEmpty()) {
			System.out.println(palavrasUnica);
		} else {
			System.out.println("Conjunto Vazio!!");
		}
	}

}

package list.cadastro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> listaOrdenacao;

	public OrdenacaoPessoa() {
		this.listaOrdenacao = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		listaOrdenacao.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> listaOrdenarPorIdade = new ArrayList<>(listaOrdenacao);
		Collections.sort(listaOrdenarPorIdade);
		return listaOrdenarPorIdade;
	}

	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> listaOrdenarAltura = new ArrayList<>(listaOrdenacao);
		Collections.sort(listaOrdenarAltura, new ComparatorPorAltura());
		return listaOrdenarAltura;
	}

}

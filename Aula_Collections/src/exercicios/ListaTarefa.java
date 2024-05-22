package exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> lista;

	public ListaTarefa() {
		this.lista = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		lista.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for (Tarefa listTarefa : lista) {
			if (listTarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(listTarefa);
			}
		}
		lista.removeAll(tarefaParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return lista.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(lista);
	}

}

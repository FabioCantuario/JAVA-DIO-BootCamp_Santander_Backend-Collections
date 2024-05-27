package list.tarefas;

public class PrincipalListaTarefa {

	public static void main(String[] args) {

		ListaTarefa lista = new ListaTarefa();

		System.out.println("Quantidade de tarefa inicial: " + lista.obterNumeroTotalTarefas());

		for (int i = 0; i < 10; i++) {
			String n = String.valueOf(i);
			lista.adicionarTarefa("Tarefa " + n);
			//System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
		}
		System.out.println("");
		System.out.println("Quantidade de tarefa na Lista Completa: " + lista.obterNumeroTotalTarefas());
		
		lista.removerTarefa("Tarefa 2");
		System.out.println("Quantidade de tarefa na Lista Completa: " + lista.obterNumeroTotalTarefas());
		System.out.println("");
		lista.obterDescricoesTarefas();


	}

}

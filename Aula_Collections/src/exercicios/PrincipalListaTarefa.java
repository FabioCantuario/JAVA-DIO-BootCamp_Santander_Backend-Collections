package exercicios;

public class PrincipalListaTarefa {

	public static void main(String[] args) {
		
		ListaTarefa lista = new ListaTarefa();
		
		System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
		
		for(int i = 0; i < 10;i++) {
			lista.adicionarTarefa("Tarefa " + i);
		}
		
		System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());

	}

}

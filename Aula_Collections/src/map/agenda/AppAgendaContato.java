package map.agenda;

public class AppAgendaContato {

	public static void main(String[] args) {

		AgendaContato agenda = new AgendaContato();

		agenda.adicionarContato("Fábio", 92992137);
		agenda.adicionarContato("Camila", 123456);
		agenda.adicionarContato("João", 5665);
		agenda.adicionarContato("Carlos", 1111111);
		agenda.adicionarContato("Ana", 654987);
		agenda.adicionarContato("Maria", 1111111);
		agenda.adicionarContato("Camila", 44444);

		agenda.exibirContatos();

		System.out.println("");

		// Remover um contato
		agenda.removerContato("Maria");
		agenda.exibirContatos();

		System.out.println("");

		// Pesquisar número por nome
		String nomePesquisa = "João";
		Integer numeroPesquisa = agenda.pesquisarPorNome("João");
		System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

		System.out.println("");

		String nomePesquisaNaoExistente = "Paula";
		Integer numeroPesquisaNaoExistente = agenda.pesquisarPorNome(nomePesquisaNaoExistente);
		System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);

	}

}

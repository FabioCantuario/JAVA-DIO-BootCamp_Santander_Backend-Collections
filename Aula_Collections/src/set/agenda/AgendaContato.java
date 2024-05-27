package set.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

	private Set<Contato> agenda;

	public AgendaContato() {
		this.agenda = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		agenda.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		System.out.println(agenda);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatos = new HashSet<>();
		for (Contato c : agenda) {
			if (c.getNome().startsWith(nome)) {
				contatos.add(c);
			}
		}
		return contatos;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c : agenda) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}

}

package set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

	private Set<Convidado> conjConvidado;

	public ConjuntoConvidado() {
		this.conjConvidado = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		conjConvidado.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		if (!conjConvidado.isEmpty()) {
			for (Convidado c : conjConvidado) {
				if (c.getConvite() == codigoConvite) {
					convidadoParaRemover = c;
					break;
				} else {
					System.out.println("Não existe convite.");
				}
			}
			conjConvidado.remove(convidadoParaRemover);
		} else {
			System.out.println("Conjunto vazio!!!");
		}

	}

	public int contarConvidados() {
		return conjConvidado.size();
	}

	public void exibirConvidados() {
		System.out.println(conjConvidado);
	}

}

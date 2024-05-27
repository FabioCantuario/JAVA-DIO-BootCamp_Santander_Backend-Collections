package set.convidados;

public class AppConvite {

	public static void main(String[] args) {
		
		ConjuntoConvidado convite = new ConjuntoConvidado();
		
		System.out.println("Existem: " + convite.contarConvidados());
		
		convite.adicionarConvidado("Fábio", 1);
		convite.adicionarConvidado("Teste2", 2);
		convite.adicionarConvidado("Ana", 8);
		convite.adicionarConvidado("Karen", 50);
		convite.adicionarConvidado("Teste3", 2);
		
		
		System.out.println("Updated: " + convite.contarConvidados());
		System.out.println("Lista:");
		convite.exibirConvidados();
		convite.removerConvidadoPorCodigoConvite(8);
		System.out.println("Updated: " + convite.contarConvidados());
		System.out.println("Lista:");
		convite.exibirConvidados();

	}

}

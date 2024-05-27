package calculo;

public class AppCalculoNumeroInteiro {

	public static void main(String[] args) {

		SomaNumero numero = new SomaNumero();

		numero.adicionarNumero(2);
		numero.adicionarNumero(5);
		numero.adicionarNumero(-10);
		numero.adicionarNumero(20);
		numero.adicionarNumero(-2);
		numero.adicionarNumero(10);

		System.out.print("Números adicionados:");
		numero.exibirNumeros();

		// Calculando e exibindo a soma dos números na lista
		System.out.print("A soma dos valores inteiros: ");
		numero.calcularSoma();

		// Encontrando e exibindo o maior número na lista
		System.out.print("O maior valor da lista é: ");
		numero.encontrarMaiorNumero();

		// Encontrando e exibindo o menor número na lista
		System.out.print("Menor número = ");
		numero.encontrarMenorNumero();

	}

}

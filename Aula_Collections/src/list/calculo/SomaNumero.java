package list.calculo;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {

	private List<NumeroInteiro> listaNumero;

	public SomaNumero() {
		this.listaNumero = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		listaNumero.add(new NumeroInteiro(numero));
	}

	public void calcularSoma() {
		int soma = 0;
		if (!listaNumero.isEmpty()) {
			for (NumeroInteiro lista : listaNumero) {
				soma += lista.getNumero();
			}
			System.out.println(soma);
		}
	}

	public void encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if (!listaNumero.isEmpty()) {
			for (NumeroInteiro lista : listaNumero) {
				if (lista.getNumero() >= maiorNumero) {
					maiorNumero = lista.getNumero();
				}
			}
			System.out.println(maiorNumero);
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if (!listaNumero.isEmpty()) {
			for (NumeroInteiro lista : listaNumero) {
				if (lista.getNumero() <= menorNumero) {
					menorNumero = lista.getNumero();
				}
			}
			System.out.println(menorNumero);
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirNumeros() {
		if (!listaNumero.isEmpty()) {
			System.out.println(this.listaNumero);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

}

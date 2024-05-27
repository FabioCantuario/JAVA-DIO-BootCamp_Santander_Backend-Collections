package list.calculo;

public class NumeroInteiro {

	private int numero;

	public NumeroInteiro(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Numero: " + numero;
	}

}

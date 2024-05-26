package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	private List<Item> listaCompras;

	public CarrinhoDeCompra() {
		this.listaCompras = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		listaCompras.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> listaRemoverItem = new ArrayList<>();
		if (!listaCompras.isEmpty()) {
			for (Item listaNomeItem : listaCompras) {
				if (listaNomeItem.getNome().equalsIgnoreCase(nome)) {
					//listaNomeItem.getNome().equalsIgnoreCase(nome);
					listaRemoverItem.add(listaNomeItem);
				}
				
			}
		}
		listaCompras.removeAll(listaRemoverItem);
	}

	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!listaCompras.isEmpty()) {
			for (Item listaCalculo : listaCompras) {
				double auxCalculo = listaCalculo.getPreco() * listaCalculo.getQuantidade();
				valorTotal += auxCalculo;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}

	}
	
	public void exibirItens() {
		//List<Item> listaExibir = new ArrayList<>();
		if(!listaCompras.isEmpty()) {
			System.out.println(listaCompras);
		} else {
			System.out.println("Lista vazia");
		}
	}
	
	/*@Override
	  public String toString() {
	    return "CarrinhoDeCompras{" +
	        "itens=" + listaCompras +
	        '}';
	}*/

}

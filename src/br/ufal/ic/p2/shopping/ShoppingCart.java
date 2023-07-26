package br.ufal.ic.p2.shopping;

import java.util.ArrayList;

public class ShoppingCart {
	private Costumer client;
	private ArrayList<Product> productList;
	
	public ShoppingCart(Costumer client) {
		this.client = client;
		this.productList = new ArrayList<Product>();
	}
	
	public void setProductList(Product produto) {
		this.productList.add(produto);
	}
	
	public int getCostumerID() {
		return client.getId();
	}
	
	public double getTotalPrice() {
		double total = 0;
		for(Product produto: productList) {
			total += produto.getPrice();
		}
		
		return total;
	}
	
	public String getContents() {
		String saida = "";
		for(Product produto: productList) {
			saida += produto.getName() + '\n';
		}
		
		return saida;
		
	}
	
	public int getItemCount() {
		return productList.size();
	}
	
	public void removeProduct(Product produto) {
		this.productList.remove(produto);
	}
}

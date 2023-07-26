package br.ufal.ic.p2.shopping;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product produto1 = new Product("camisa", 99.5); 
		Product produto2 = new Product("calca", 105.10);
		Product produto3 = new Product("chapeu", 50.75);
		
		Costumer cliente1 = new Costumer(1, "Joao", "bairro do poço");
		
		ShoppingCart carrinho1 = new ShoppingCart(cliente1); //criando carrinho do cliente1
		
		carrinho1.setProductList(produto1); //adicionado produto1 no carrinho do cliente1
		carrinho1.setProductList(produto2); //adicionado produto2 no carrinho do cliente1
		carrinho1.setProductList(produto3); //adicionado produto3 no carrinho do cliente1
		
		System.out.println("ID do dono do carrinho: "+carrinho1.getCostumerID()); //id do costumer do carrinho1
		
		System.out.println();
		
		System.out.println(carrinho1.getContents()); //mostrando todos os produtos daquele carrinho
		
		System.out.println("Total de produtos: " + carrinho1.getItemCount());
		
		
		System.out.println("Valor total do carrinho: "+carrinho1.getTotalPrice()); //total do carrinho1
		
		System.out.println("**Removendo um produto");
		
		carrinho1.removeProduct(produto1);//removendo o produto 1 do carrinho
		
		System.out.println(carrinho1.getContents()); //mostrando todos os produtos daquele carrinho
		
		System.out.println("Total de produtos: " + carrinho1.getItemCount());
	
		System.out.println("Valor total do carrinho: "+carrinho1.getTotalPrice()); //total do carrinho1
		
		
	}

}

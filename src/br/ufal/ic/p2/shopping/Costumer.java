package br.ufal.ic.p2.shopping;

public class Costumer {
	private Integer id;
	private String name;
	private String address;
	
	public Costumer(int id,String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	
}

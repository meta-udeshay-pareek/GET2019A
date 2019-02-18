package model;

public class Product {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	
	/*
	 * @return product Id
	 * */
	public int getId(){
		return this.id;
	}
	

	/*
	 * @return product Name
	 * */
	public String getName(){
		return this.name;
	}
	
	/*
	 * @return product Price
	 * */
	public double getPrice(){
		return this.price;
	}
	
	/*
	 * @return quantity product quantity in cart
	 * */
	public int getQuantity(){
		return this.quantity;
	}
	
	/*
	 * @param pId product Id
	 * */
	public void setId(int pId){
		this.id = pId;
	}
	
	/*
	 * @param pName product Name
	 * */
	public void setName(String pName){
		this.name = pName;
	}
	
	/*
	 * @param pPrice product Price
	 * */
	public void setPrice(double pPrice){
		this.price = pPrice;
	}
	
	/*
	 * @param quantity quantity of product in cart
	 * */
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	
}

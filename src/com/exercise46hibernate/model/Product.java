package com.exercise46hibernate.model;

public class Product {
	private int idProduct;
	private String nameProduct;
	private double priceProduct;
	public Product() {}
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public double getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}
	@Override
	public String toString() {
		return "Product [idProduct = "+ idProduct + "nameProduct" + nameProduct + "priceProduct" + priceProduct + "]";
	}
}

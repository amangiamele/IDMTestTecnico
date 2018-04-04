package com.solution.model;

public class Product {

	private double taxRate;
	private String name;
	private double price;

	public Product(double taxRate, String name, double price) {
		this.taxRate = taxRate;
		this.name = name;
		this.price = price;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	protected void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getAmountTax() {
		double amountTax = price * taxRate;
		return roundTax(amountTax);
	}
	
	private double roundTax(double value) {
		return Math.round(value * 20) / 20;
	}
}

package com.solution.model;

import java.util.Objects;

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
		double tempValue = value * 20;
		tempValue = Math.round(tempValue);
		tempValue = tempValue / 20;
		return tempValue;
	}
	
	public double getNetPrice() {
		double price = getPrice();
		double amountTax = getAmountTax();
		return price - amountTax;
	}
	
	public String toString() {
		return getName() + ": " + getNetPrice();
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) {
        	return true;
        }
        if (o == null || getClass() != o.getClass()) {
        	return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.getName());
    }
}
